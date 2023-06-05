package com.kryptopass.dessertpusher

import android.content.ActivityNotFoundException
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ShareCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleObserver
import com.kryptopass.dessertpusher.databinding.ActivityMainBinding
import timber.log.Timber

const val KEY_REVENUE = "key_revenue"
const val KEY_DESSERTS_SOLD = "key_desserts_sold"
const val KEY_DESSERT_TIMER = "key_dessert_timer"

class MainActivity : AppCompatActivity(), LifecycleObserver {

    private var revenue = 0
    private var dessertsSold = 0
    private lateinit var dessertTimer: DessertTimer
    private lateinit var binding: ActivityMainBinding

    /**
     * Simple data class that represents a dessert. Includes the resource id integer associated with
     * the image, the price it's sold for, and the startProductionAmount, which determines when
     * the dessert starts to be produced.
     */
    data class Dessert(val imageId: Int, val price: Int, val startProductionAmount: Int)

    // Create a list of all desserts, in order of when they start being produced
    private val allDesserts = listOf(
            Dessert(R.drawable.cupcake, 5, 0),
            Dessert(R.drawable.donut, 10, 5),
            Dessert(R.drawable.eclair, 15, 20),
            Dessert(R.drawable.froyo, 30, 50),
            Dessert(R.drawable.gingerbread, 50, 100),
            Dessert(R.drawable.honeycomb, 100, 200),
            Dessert(R.drawable.icecreamsandwich, 500, 500),
            Dessert(R.drawable.jellybean, 1000, 1000),
            Dessert(R.drawable.kitkat, 2000, 2000),
            Dessert(R.drawable.lollipop, 3000, 4000),
            Dessert(R.drawable.marshmallow, 4000, 8000),
            Dessert(R.drawable.nougat, 5000, 16000),
            Dessert(R.drawable.oreo, 6000, 20000)
    )
    private var currentDessert = allDesserts[0]

    /**
        called first time activity starts, only called once during lifecycle of activity
        activity is not yet visible and you cannot interact with it
        inflate activity's UI, initialize variables, and
        do any other initialization that only happens once during activity lifetime
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("onCreate Called")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.dessertButton.setOnClickListener {
            onDessertClicked()
        }
        dessertTimer = DessertTimer(this.lifecycle)

        if (savedInstanceState != null) {
            revenue = savedInstanceState.getInt(KEY_REVENUE)
            dessertsSold = savedInstanceState.getInt(KEY_DESSERTS_SOLD)
            dessertTimer.secondsCount = savedInstanceState.getInt(KEY_DESSERT_TIMER)
            Timber.i("onCreate: Restoring previous state")
        }

        binding.revenue = revenue
        binding.amountSold = dessertsSold

        binding.dessertButton.setImageResource(currentDessert.imageId)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY_REVENUE, revenue)
        outState.putInt(KEY_DESSERTS_SOLD, dessertsSold)
        outState.putInt(KEY_DESSERT_TIMER, dessertTimer.secondsCount)
        Timber.i("onSaveInstanceState Called")
    }

    /**
        triggered when activity is about to become visible
        can be called multiple times as user navigates away from activity and then back
        start any sensors, animations, or other procedures that need to start
        when activity is visible
     */
    override fun onStart() {
        super.onStart()
        Timber.i("onStart Called")
    }

    /**
     *
     */
    override fun onRestart() {
        super.onRestart()
        Timber.i("onRestart Called")
    }

    /**
        triggered when activity has focus and user can interact with it
        start any sensors, animations, or other procedures that need to start
        when activity has focus
     */
    override fun onResume() {
        super.onResume()
        Timber.i("onResume Called")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        // after onStart is called
    }

    /**
     * Updates the score when the dessert is clicked. Possibly shows a new dessert.
     */
    private fun onDessertClicked() {
        revenue += currentDessert.price
        dessertsSold++

        binding.revenue = revenue
        binding.amountSold = dessertsSold

        showCurrentDessert()
    }

    /**
     * Determine which dessert to show
     */
    private fun showCurrentDessert() {
        var newDessert = allDesserts[0]
        for (dessert in allDesserts) {
            if (dessertsSold >= dessert.startProductionAmount) {
                newDessert = dessert
            }
            else break
        }

        if (newDessert != currentDessert) {
            currentDessert = newDessert
            binding.dessertButton.setImageResource(newDessert.imageId)
        }
    }

    /**
     * Menu methods
     */
    private fun onShare() {
        val shareIntent = ShareCompat.IntentBuilder.from(this)
                .setText(getString(R.string.share_text, dessertsSold, revenue))
                .setType("text/plain")
                .intent
        try {
            startActivity(shareIntent)
        } catch (ex: ActivityNotFoundException) {
            Toast.makeText(this, getString(R.string.sharing_not_available),
                    Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.shareMenuButton -> onShare()
        }
        return super.onOptionsItemSelected(item)
    }

    /**
        called as soon as activity loses focus and user cannot interact with it
        stop any sensors, animations, or other procedures that should not run
        when activity does not have focus and is partially obscured
        keep execution fast, next activity is not shown until this completes
     */
    override fun onPause() {
        super.onPause()
        Timber.i("onPause Called")
    }

    /**
        called when you no longer see activity
        stop any sensor, animations, or other procedures that should not run
        when the activity is not on screen
        use this to persist (permanently save) data
     */
    override fun onStop() {
        super.onStop()
        Timber.i("onStop Called")
    }

    /**
        called once when the activity is fully destroyed
        tear down or release any resources that are related to the activity
        and are not automatically released for you
     */
    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy Called")
    }
}

# Android Lifecycles

## Activity Lifecycle

- onCreate: one time initializations, layout inflations
- onStart: start objects that only run when activity is on screen
- onRestart: anything that runs only if not being created
- onResume:
- onPause: blocks UI from drawing; keep this light-weight
- onStop: stop objects that only run when activity is on screen; permanently save data
- onDestroy: final tear down

## Lifecycle Library

- LifecycleOwner
- LifecycleObserver

##  Android Debug Bridge (adb)

- `adb shell am kill com.kryptopass.dessertpusher`
- onSaveInstanceState: save data to bundle (safety save in case app process torn down by OS)

## Configuration Changes

- User changed device language
- User plugs in physical keyboard
- User rotates device

## References

- [The Android Lifecycle cheat sheet — part I: Single Activities](https://medium.com/androiddevelopers/the-android-lifecycle-cheat-sheet-part-i-single-activities-e49fd3d202ab)
- [The Android Lifecycle cheat sheet — part II: Multiple activities](https://medium.com/androiddevelopers/the-android-lifecycle-cheat-sheet-part-ii-multiple-activities-a411fd139f24)
- [The Android Lifecycle cheat sheet — part III : Fragments](https://medium.com/androiddevelopers/the-android-lifecycle-cheat-sheet-part-iii-fragments-afc87d4f37fd)


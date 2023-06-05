# Lifecycle Quiz

## Track State Activity

```
The user opens a physics simulation that takes a lot of heavy computation to display. 
Then they get a phone call. 
During the phone call, should you keep computing the positions of objects 
in the physics simulation?

Yes
No      CHECK
```

## Lifecycle Callbacks

```
Open your activity and then navigate out of the activity by pressing the back button. 
Which callbacks are called and in what order?

Opening activity state 1: onCreate
Opening activity state 2: onStart
Opening activity state 3: onResume
Closing activity state 1: onPause
Closing activity state 2: onStop
Closing activity state 3: onDestroy
```

## Lifecycle: Share dialog

```
Open up the share dialog, then click outside of the share dialog to close it. 
Which callbacks are called in the activity and in what order?

Open share pop-up state 1: onPause
Close share pop-up state 2: onResume
```

## Lifecycle State

```
Given what we just explored about lifecycle state, answer the following. 
Right now we initialize dessertsSold to 0 at declaration. 
Let's say we also set dessertsSold to 0 in onCreate. 
What, if anything, would change?

The app would work the same
Whenever you navigate away from the activity and come back, you'd lose the revenue value
The app would crash
Whenever you pressed the share button, the game would restart
You'd never be able to get beyond making cupcakes
```

## Activity Events

```
In which method is the Acivity visible?
onCreate
onStart
onResume    CHECK
None of the Above

Which methods is/are called after orientation changes?
onCreate
onResume    CHECK
onStart     CHECK
None of the above

Which method is called first after an orientation change?
onPause     CHECK
onStop
onResume
None of the Above
```

## Lifecycle: Navigate Away

```
Open the app, then press the home button and go to the home screen. 
Then navigate back to the activity. Starting from when you navigate to the home screen, 
Which callbacks are called and in what order?

Navigate to home screen state 1: onPause
Navigate to home screen state 2: onStop
Navigate back from Recents state 1: onRestart
Navigate back from Recents state 2: onStart
Navigate back from Recents state 3: onResume
```

## Lifecycle

```
Activities and Fragments share a lifecycle.
True
False   CHECK

Each lifecycle method has a corresponding paired method for open and close.
True    CHECK
False

Fragments are destroyed when they are no longer visible?
True    CHECK
False

Which Fragment lifecycle method are its Views visible?
onCreateView
onViewCreated
onResume
onStart
```

## Configuration Change (Rotate Phone)

```
Rotate phone state 1: onPause
Rotate phone state 2: onStop
Rotate phone state 3: onDestroy
Rotate phone state 4: onCreate
Rotate phone state 5: onStart
Rotate phone state 6: onResume
```

## Bundle State

```
What happens to an activity if you override onSaveInstanceState and save some of your data, 
but don't call the super method?

1. The app would crash when a configuration change happens.
2. When the activity restarts after a configuration change, 
   it could be missing some data, such as the edit text data.   CHECK
3. If the activity restarts after a process kill, 
   it will not be able to finish rendering, and will call finish() on the screen.
4. You'll get a TransactionTooLargeException whenever the app restarts.
```


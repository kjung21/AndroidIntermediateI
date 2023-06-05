# App Architecture

## What is wrong with the app?

```
1. The app doesn't properly save the restore state during configuration changes
   and processes related shutdown       CHECK
2. The app doesn't call the proper methods in onPause and onResume 
   to start and stop the counting of the score
3. The app doesn't correctly manage the backstack when navigating
4. The app has a memory leak that could be solved by implementing a LifecycleObserver
```

## ViewModel

```
ViewModels should be aware of the UI layer.
True
False   CHECK

Proper MVVM architecture dictates a unidirectional data flow.
True    CHECK
False

Methods that update TextViews should exist in which layer?
View    CHECK
ViewModel
Model
None of the above

Fields that store references to Views should be stored in which layer?
View    CHECK
ViewModel
Model
None of the above

Fields that store data required for business logic should be stored in which layer?
View
ViewModel   CHECK
Model
None of the above

Fields that represent data for objects should be stored in which layer?
View    CHECK
ViewModel
Model
None of the above
```

## What should be moved to the ViewModel?

```
1. The ViewModel is a stable place to store the data to display in the associated UI controller.
2. The Fragment draws the data on screen and captures input events. 
   It should not decide what to display on screen or process what happens during an input event.
3. The ViewModel never contains references to activities, fragments, or views.

The score and word field.               CHECK
The wordList field.                     CHECK
The binding field.
The resetList and nextWord methods.     CHECK
The updateWordText and updateScoreText methods.
```

## Which of these are examples of events?

```
A notification                              EVENT
    Notifications are triggered once, and then should not be shown again.
A sound playing when a button is presed     EVENT
    When you press a button and want to hear a sound, 
    you only want to hear that sound once per button click.
A loading indicator                         STATE
    A loading indicator will show the state of how much is loaded.
Navigating to a different screen            EVENT
    When something happends and you need to navigate to another screen, 
    this is a one time event.
The most recent email received              STATE
    Triggering a notification or playing a noise when the most recent email received is an event.
    The acutal data of what the current 'most recent email' is, is state.
```

## In what class should the timer go?

```
GameFragment
GameViewModel   CHECK

While the logic that redraws the timer TextView should be in the GameFragment,
the actual count down code belongs in the view model.
That way, if you ever rotate your phone, you won't lose your current count down time.
```

## Live Data

```
Which method allows the UI to track and respond to changes in the ViewModel
observe     CHECK
bind
listen
None of the above

Which method allows the UI to track and respond to changes in the ViewModel
MutableLiveDate directly
MutableLiveDate with custom getter
LiveDate with custom getter     CHECK
LiveDate directly

A notiifcation is an example of a(n)...
Event   CHECK
State
Either Event or State
Neither Event or State

Game Over is an example of a(n)..
Event
State
Either Event or State   CHECK
Neither Event or State

Paused is an example of a(n)..
Event   CHECK
State
Either Event or State
Neither Event or State

Skip Forward is an example of a(n)...
Event   CHECK
State
Either Event or State
Neither Event or State

ViewModels persist through configuration changes
True    CHECK
False
```

## You'll need some logic that determines when the phone should buzz. 

```
Where should that code go?

Bindind Adapter
ViewModel   CHECK
Fragment
XML Layout

Is this an Event or State?
Event   CHECK
State
```


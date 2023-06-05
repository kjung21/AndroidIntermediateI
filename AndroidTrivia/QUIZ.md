# Quiz: Navigation Component

## Match the definition to the correct answer.

```
In a Fragment, you don’t inflate the view in onCreate like in an activity, 
but instead in this method.
onCreateView()

Use this property from within a Fragment to get access to string and image resources.
context

UI Fragments contain a layout and occupy a place within.
The Activity layout.
```

## Match the action with the correct definition.

```
PopTo Not-Inclusive: pops off everything on the back stack until it finds the referenced fragment transaction.
PopTo Inclusive: pops off everything on the back stack, including the referenced fragment transaction.
```

## Up vs Back Button Usage - Which of these is true?

```
1. The up button and the back button both navigate within in the app.
2. The back button navigates out of the app and into other applications.
3. The up button can navigate up to another app.

1 and 2 are true for the up and back button.
```

## Match menu attributes to their function

```
onOptionsItemSelected: Called when a menu item is selected
setHasOptionsMenu: Tells Android that the Fragment has a menu
onCreateOptionsMenu: Where you inflate your menu
title: String displayed in the menu
id: Used by navigation to determine where to navigate
```

## What are advantages we get from using safe arguments?

```
1. We get type safety, as navigation generates the action and the argument class
   from the navigation graph.
2. We get argument enforcement, as non-default arguments are required parameters
   in the action.
3. We get to avoid all of the overhead of passing arguments in an Android bundle.

1 and 2 are advantages of using safe arguments.
```

## Match the intent type with its correct functionality

```
Explicit Intent: Launches an Activity based upon its class name
Implicit Intent: Launches an Activity based upon parameters, such as action, data, and data type.
```

## Match the navigation method with its correct functionality

```
App Drawer navigation: Defaults to popping everything off the backstack except for the start destination.
Menu navigation: Adds to the backstack from the current position.
DrawerLayout: Provides the foundation for the sliding behavior of the navigation drawer.
NavigationView: Material Design container that provides the look, feel, and functionality of the Navigation Drawer.
```


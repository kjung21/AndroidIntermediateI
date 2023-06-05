# Quiz: Layout

## Which of the following are view groups?

```
EditText
LinearLayout        CHECK
ConstraintLayout    CHECK
ScrollView          CHECK
```

## Match the ViewGroup purpose on the left to its ViewGroup name on the right.

```
ViewGroup to use when you need to scroll a single view vertically.
ScrollView

ViewGroup to use for a strictly horizontal list-style arrangement of views.
LinearLayout - horizontal

ViewGroup that is useful for a strictly vertical list-style arrangement of views.
LinearLayout - vertical

A ViewGroup where elements can be arranged freely, are placed by the system based on constraints, 
and may adapt in size based on screen size and orientation.
ConstraintLayout
```

## One of the listed view hierarchies shown is not valid. Select the invalid view hierarchy.

```
LinearLayout > TextView > TextView, ImageView
ConstraintLayout > TextView > Button, Button, Scrollview > TextView
TextView > TextView, ImageView, ScrollView      CHECK
```

## Match the parts of the Layout Editor with their descriptions.

```
Shows the project hierarchy in an arrangement that is more intuitive 
for Android projects than the raw file hierarchy.
Project View, Android

Lets you switch between visual and code representation of the screen layout.
Design and Text tabs

Lists common views for UI elements and layouts that you can add to the layout design.
Palette

Shows the layout hierarchy as a tree of views.
Component Tree

Shows a preview of your screen and a blueprint version.
Design Editor

Shows attributes of the currently selected view.
Attributes pane
```

## Check all the answers that are true for TextViews.

```
TextViews are for displaying text and images.
TextViews are for displaying formatted and styled text.     CHECK
```

## Check the correct answers.

```
Styles are a resource.
Styles are defined in styles.xml.
With styles, you can define colors, fonting, text size, and many other characteristics of a view.
Styles help make the elements of a layout look consistent.
Using styles saves work and makes your code more readable.
```

## Match each term with its correct definition.

```
ImageView
A view for displaying images.

contentDescription
Property of ImageView used by screen readers to describe an image to the user.

Drawable
Resource type that can be displayed in an ImageView.

Right-click > Refactor > Rename         
Always refactor when renaming a view or resource 
so that all references are changed in the code.
```

## Check all the answers that are true for EditText views.

```
EditText extends TextView.                                                  CHECK
You must specify an inputType for every EditText.
The Android system automatically validates input based on the inputType.    CHECK
You should not provide hints because they clutter the input field.
Selecting the narrowest inputType helps users avoid errors.                 CHECK
```

## Check all the answers that are true for Buttons.

```
Buttons are an extension of TextView.                                                   CHECK
You can only have three buttons per screen.
Users expect that buttons are clickable and on click, something noticeable happens.     CHECK
You must define a click listener for each button.
```

## Check all the answers that are true for Data Binding.

```
1. Data binding generates the Binding object at compile time for all views in the layout.
2. Accessing views through the Binding object is more efficient than using findViewById.
3. For complex view hierarchies, data binding can be a significant performance gain.
4. You should not use data binding if your app is simple.
5. findViewById traverses the view hierarchy at runtime to find a view every time it's called.

1, 2, 3, and 5 are true for Data Binding.
```


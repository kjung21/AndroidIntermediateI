## Android Anatomy

## java

- kotlin files: recall *.kt files are compiled to java
- inter-operates seamlessly with java
- test
- androidTest

## res

- Resources: static content used in Android app
- Like images, text strings, screen layouts, 
  - values with hexadecimal colors and standard dimensions used in your app's layouts

## generatedJava

- Files that are generated when the app is built
- Should not need to edit anything in here

## manifests

- AndroidManifest.xml
- File includes essential details about your application
  - that the OS needs to know about to be able to run your app
- `intent-filter` tag with `MAIN` and `LAUNCHER` attributes in `action` and `category` tags
  - indicate to the OS, the entry point to the app when user clicks launcher icon
- Permissions need to be defined in AndroidManifest.xml
  - e.g. `INTERNET` permission to access the internet

## Gradle Scripts

- Files in here were created for you during project setup
- Takes Kotlin files, any external libraries, compiles them, 
  - bundles up res folder, and generates an installable APK file

## Activity and Layout

- Activity's have an associated layout file
- Layout inflation process is what connects Activities and Layouts
- Process is triggered when the Activity is created

## Gradle: Android Build Tool

- What devices run your app
- Compile to executable
- Dependency Management
- App signing for Google Play
- Automated Tests


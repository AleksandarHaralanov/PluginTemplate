# PluginTemplate
A template project to use as a base for [Poseidon](https://github.com/RhysB/Project-Poseidon), a fork of CB1060, for Minecraft b1.7.3 plugin development.

## Features
1. Implements a function inside [build.gradle](https://github.com/AleksandarHaralanov/PluginTemplate/blob/master/build.gradle) that names the plugin's compiled `.jar` file using the plugin's name and version directly from the `plugin.yml` file.
2. The [Main](https://github.com/AleksandarHaralanov/PluginTemplate/blob/master/src/main/java/org/example/Main.java) class includes variables for the plugin's name and version, both sourced from the `plugin.yml` file once
again.  It also includes pre-made loggers, that utilize the plugin's name and version, for when the plugin is enabled and disabled, as well as the mandatory `onEnable` and `onDisable` methods for the plugin's functionality.
   - You can use these variables to your liking. E.g., they are also used in UpdateUtil class file's methods. Check below for more info.
3. The template also includes my own `com.haralanov.utilities` package with the following features:
   - [PdfUtil](https://github.com/AleksandarHaralanov/PluginTemplate/blob/master/src/main/java/com/haralanov/utilities/PdfUtil.java) - Allows for a custom attribute `github` to be created inside the `plugin.yml` file. The attribute's value is used when utilizing the class below to set up a check for updates.
   - [UpdateUtil](https://github.com/AleksandarHaralanov/PluginTemplate/blob/master/src/main/java/com/haralanov/utilities/UpdateUtil.java) - Allows setting up a check for updates.

## Usage
While the project may be compatible with other Integrated Development Environments (IDEs), it is highly recommended to use IntelliJ IDEA by JetBrains for optimal performance.
1. Clone the repository by utilizing the Version Control System (VCS) and entering this GitHub repository's link when initiating a new project.
2. After cloning, update the following directory with your specific details:
   - `Project/src/main/resources/plugin.yml`
3. **Optionally**, you may use the bundled in package's features. Check **Features** header above for more information.
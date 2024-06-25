# PluginTemplate
A template project to use as a base for [Poseidon](https://github.com/RhysB/Project-Poseidon), a fork of CB1060, for Minecraft b1.7.3 plugin development.

<hr>

## Features
1. Implements a function inside `build.gradle` that names the plugin jar file after build using the plugin's
name and version from the `plugin.yml` file, e.g., `Plugin-1.0.0.jar`.
2. The `Main.java` class includes variables for the plugin's name and version, both sourced from the `plugin.yml` file.
3. It also includes pre-made loggers for when the plugin is enabled and disabled, as well as methods for enabling and
disabling the plugin.
4. The template also includes a `me.beezle.extras` package with the following features:
   - **ColorUtil** - Allows translating alternate color codes.
   - **UpdateUtil** - Allows setting up a check for updates.

<hr>

## Usage
While the project may be compatible with other Integrated Development Environments (IDEs), it is highly recommended to
use IntelliJ IDEA by JetBrains for optimal performance.

<hr>

1. Clone the repository by utilizing the Version Control System (VCS) and entering this GitHub repository's link when
initiating a new project.
2. After cloning, update the following directory with your specific details:
   - `Project/src/main/resources/plugin.yml`
3. Additionally, you may use the bundled in package explained above in [Features](#Features) section.
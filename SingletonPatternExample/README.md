# Singleton Pattern Example 1

Singleton Class can have only one object at a time. After first time, if we try to instantiate the Java Singleton Classes, the new variables also point to the first instance created. So any modifications we do to any variable through any instance is visible if we access that variable through other instance.

## Components
1. Create a Class that has a private static instance of itself.
2. The constructor of the class be `private`.
3. Make a public static method to get the instance of the class.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

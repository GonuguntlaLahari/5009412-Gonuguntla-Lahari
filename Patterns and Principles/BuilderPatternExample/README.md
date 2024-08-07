# Builder Pattern Example 3

## Need for it
Method Chaining is used to invoke multiple methods on the same object which occurs as a single statement. `The problem` occurs when it is accessed concurrently. A thread may observe some of the values to be inconsistent. Although,setter mthods are atomic, calls in the method chaining can lead to inconsistent object state when the object is being modified.

## Solution
Builder Method ensures thread-safety and atomicity of object creation. Builder Class is made static inside the Server Class, with instance fields for that class. The setter methods will return Builder Class Reference. The build method returns an instance of the Server Class, with the builder object being passed.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

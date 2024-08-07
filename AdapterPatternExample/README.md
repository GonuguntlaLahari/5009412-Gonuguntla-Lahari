# Adapter Design Pattern Example 4

Allows the interface of an existing class to be used as another interface. It acts as a bridge between two incompatible interfaces making them work together.

## Components
1. Target Interface: The common interface the client interacts with.
2. Adaptee: The class or system that the client code cannot use directly due to interface mismatches.
3. Adapter: A class that implements the target interface and internally uses an instance of the Adaptee to make it compatible with the target interface. Acting as a bridge.
4. Client: The code that uses the Target Interface to interact with objects. It remains unaware of the specific implementation details of the adapter and the adaptee.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.
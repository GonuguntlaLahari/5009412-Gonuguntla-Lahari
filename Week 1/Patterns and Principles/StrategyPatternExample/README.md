# StrategyPatternExample Number 8

Defines a family of algorithms, encapsulates each one and makes them `interchangeable` allowing clients to switch algorithms dynamically without altering the code structure.

## Components of this design

>Context Class, Strategy Interface, Concrete Strategies, Client.
1. `Strategy Interface`: Common implementations that all strategies must have.
2. `Concrete Strategies`: Implement the Strategy Interface.
3. `Context Class`: First an Object of Strategy Interface is made. Initialize it with a Concrete Strategy. Provide a method to change the Concrete Strategy.
4. `Client`: Object of context class with a default chosen Concrete Strategy. Change strategies as needed and perform a method provided in Context Class.



### Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

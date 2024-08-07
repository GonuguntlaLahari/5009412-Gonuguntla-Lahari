# Factory Method Pattern Example 2

Providing interface for creating objects in a superclass while alllowing subclass to alter the type of objects that will be created.

## Components
1. A product interface or abstract class that defines the methods.
2. Concrete Classes built upon the interface or abstract class, specifying its own product.
3. Factory abstract class is created with a method that returns the product.
4. Concrete Factory Classes created that extends the abstract factory class. Returning different product objects.
5. Client class, where Product Factory class is intantiated. Another product type object is created. Then through that object the methods of the product is called.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

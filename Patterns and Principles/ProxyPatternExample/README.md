# Proxy Design Pattern Example 6

it provides a surrogate or placeholder for another object to control access to it. The proxy acts as an intermediary, controlling access to the real object.
## Used
This is useful when to add an extra layer of control over access to an object.
## Components
1. Subject - Defines the common interface shared by the Real Subject and Proxy.
2. Real Subject - It contains the real implementation of the resource that the client code wants to access.
3. Proxy - It acts as surrogate or placeholder for the Real Subject. Controls access to the real object, may provide additional functionalities such as `lazy loading, access control or logging.`

### Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

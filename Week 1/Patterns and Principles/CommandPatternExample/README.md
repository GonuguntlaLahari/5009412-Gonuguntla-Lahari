# Command Pattern Example

Command Pattern encapsulates a request as an object, allowing for the seperation of sender and  receiver. Different commands with different parameters can be created without changing the invoker.

## Components
1. Command Interface - It declares a common method execute() which every concrete command class must define.
2. Concrete Command Class - They are the specific commands. They encapsulate the details of a particular action. 
3. Invoker(Remote Control) - Responsible for initiating the command execution. It holds a reference to command, it coordinates task without getting into nitty-gritty details. 
4. Receiver - It knows how to perform the actual task at hand. 
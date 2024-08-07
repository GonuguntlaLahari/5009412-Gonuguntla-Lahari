# Exercise 1. Inventory Management System

Q.Explain why data structures and algorithms are essential in handling large inventories. </br>
ans: Effiecient data structures and algorithms are crucial in handling large inventories for reasons like, </br>
Effiecient Storage:Memory usage is optimized and data redundancy is minimised.
Fast Retreival:Quick retreival of information.</br>
Scalablity:As the inventory grows, the system should be able to handle the increased load without perfommance degradation.</br>

Q.Discuss the type of data structures suitable for this problem.</br>
ans: 
1. Arrays - When inventory items are fixed.
2. LinkedList - Efficient insertion and deletion, inventory size can increase and it accounts that. 
3. Hash Tables - Fast retreival, deletion and addition of inventory items. Requires good hash function to reduce collisions.

Q. Analyze the time complexity of each operation in your chosen data structure.
ans: 
1. add() - O(1). Worst-Case: O(N)
2. delete() - O(1). Worst-Case: O(N)
3. update() - O(1).
4. display() - O(N): iterate over entire map.

Q. Discuss how you can optimize these operations.</br>
ans: HashMap itself is a very optimised data structure. These steps can be ensured for its optimisation:
</br>Choosing a good hash function, minimises collisions, ensures proper usage of memory-space.
</br>Choosing an appropriate initial capacity, if approximate number of elements to be stored is known. This reduces the need for resizing which can be costly.
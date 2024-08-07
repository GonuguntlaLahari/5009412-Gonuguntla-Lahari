# Exercise 5. Task Management System

Q. Explain the different types of linked lists(Singly Linked List, Doubly Linked List)</br>
ans:</br> 
1. Single Linked List : Each node contains two parts: data and a pointer to the next node. The last node points to null. Insertion is simple. Deletion is effecient if node to be deleted is known. Access the elements by traversal.
2. Double Linked List : Each node contains data, a pointer to the previous node, a pointer to the next node. The first node's previous pointer and last nodes next pointer points to null. Allows bidirectional travel. Easier deletion of node as the previous node is directly accessed.

Q. Analyze the time complexity of each operation.</br>
ans: </br>
1. add() - O(1). A node is added at beginning. O(n). A node is added elsewhere.
2. search() - O(n). The entire list needs to be traversed to find an element.
3. traverse() - O(n). The entire list is traversed.
4. delete() - O(1). The beginning node to be deleted. O(n). Any other node to be deleted.

Q. Discuss the advantages of linked lists over arrays for dynamic data.</br>
ans:</br> As data is dynamic, it is not possible to know the final size of data. Thus, an array can't be use. Even if an array is used, when the limit of array cross, it must be moved to a different array, this shall cost enough overhead. While linked lists, a node can be added any time without any large overhead. Arrays occupy contiguous memory locations, a larger block of memory needs to be asssigned to it. While linked list can do better memory usage.

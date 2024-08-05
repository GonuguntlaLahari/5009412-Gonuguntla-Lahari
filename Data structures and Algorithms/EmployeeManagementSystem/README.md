# Exercise 4. Employee Management System

Q. Explain how arrays are represented in memory and their advantages. </br>
ans:</br> Arrays are stored in contiguous memory locations, which means each element of the array is placed next to the previous element in memory. </br>
Their Advantages: Array elements can be accessed directly using its index. This provides constant time complexity O(1). As arrays are stored in contiguous memory location, there is minimal memory overhead.

Q. Analyze the time complexity of each operation.</br>
ans:
1. add() - O(1).
2. search() - O(n). The entire list needs to be traversed to find an element.
3. traverse() - O(n). The entire list is traversed.
4. delete() - O(n). Element is first searched, then O(1) is the time complexity to delete that element.</br>

Q. Discuss the limitations of array and when to use them.</br>
ans:</br>The size of array cannot be dynamically modified. Thus it has to be used only when data is static.
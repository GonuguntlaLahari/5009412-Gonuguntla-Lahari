# Exercise 6. Library Management System

1. Understand Search Algorithm</br>
Q. Explain linear search and binary search algorithms.
ans: Linear Search : It is a straightforward searching algorithm that checks each element in a list sequentially until the desired element is found. Works on both sorted and unsorted lists. Time Complexity : O(n)
Binary Search : It repeteadly divides the list in half to locate the target value. It works only on sorted list. Time Complexity : O(logn).

4. Analysis </br>
Q. Compare the time complexity of linear and binary search.
</br>ans: 
Linear Search : 
    Best-Case : O(1)
    Average-Case : O(N)
    Worst-Case : O(N)
Binary Search :
    Best-Case : O(1)
    Average-Case : O(logn)
    Worst-Case : O(logn)

    Q. Discuss when to use each algorithm based on the data set size and order.  </br>ans: 
    1) When list is ordered. Use Binary Search as it will give a time complexity of O(logn) much better than Linear Search.
    2) When list is unsorted, linear search has to be used. Binary search worls only on sorted list.
    3) When list size is small, linear search can be used.
    4) When list size is immense, it is necessary for list to be sorted. Then, Binary Sort is the best option.
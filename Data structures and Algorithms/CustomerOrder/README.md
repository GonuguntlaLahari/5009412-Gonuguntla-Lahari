# Exercise 3. Sorting Customer Orders

Q.Explain different sorting algorithms(Bubble Sort, Insertion Sort, Quick Sort, Merge Sort). </br>
ans:
1. Bubble Sort : It is a comparison-based sorting algorithm. It repeteadly steps through the list, compares adjacent elements and swaps them if they are not at the correct place. This process continues till the list is sorted. Best Case:O(n) Average and Worst-Case:O(n2).
2. Insertion Sort : It builds the array one item at a time. Starts from the second element, assuming the first element is already sorted. Compare it with the element in sorted part of the list. Shift the sorted elements to the right to insert the new element at it's correct position. Repeated for all the elements. Best Case:O(n) Average and Worst-Case:O(n2).
3. Quick Sort : It is a divide-and-conquer algorithm that selects a pivot element and partitions the array into two sub-arrays, elements less than pivot are moved left and vice versa. Recursively applied to all sub-arrays. Finally, sorted sub-arrays and pivot is combined. Best Case:O(nlogn) Average-Case:O(nlogn) Worst-Case:O(n2).
4. Merge Sort : Divide and conquer algorithm that divides the array into two halves, sorts each half, and then merges the sorted halves to produce a sorted array. Each half is sorted recursively. Best Case, Average-Case and Worst-Case:O(nlogn).

Q. Compare the perfommance of Bubble Sort and Quick Sort.</br>
ans: 
1. Bubble Sort : Best-Case: O(N), Average-Case: O(N^2), Worst-Case: O(N^2)
2. Quick Sort : Best-Case: O(NlogN), Average-Case: O(NlogN), Worst-Case: O(N^2)

Q. Discuss why Quick Sort is generally preferred over Bubble Sort.</br>
ans:</br>Quick Sort can give O(NlogN) in average, which is also it's best case. While Bubble Sort, Average Time-Complexity is O(N^2). When the data set is huge, the difference is very prominient. This also proves that Quick Sort gives a better perfommance constantly.
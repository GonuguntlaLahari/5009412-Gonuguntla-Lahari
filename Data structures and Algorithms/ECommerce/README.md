# Exercise 2. E-commerce Platform Search Function

Q. Explain Big O notation and how it helps in analyzing algorithms. </br>
ans: Big O notation is a mathematical concept to describe the upper bound of an algorithm's run time or space complexity. It focuses on the dominant term as the input size grows, ignoring constant factors and lower-order terms. It provides a high level understanding of algorithm's efficiency and scalability.
It helps in providing insight into how an algorithm performs as the input size grows. It helps in understanding the worst-case perfommance.

Q. Describe the best, average, and worst-case scenarios for search operations. </br>
ans: 
Best Case Scenario : O(1) denoting constant time. The condition in which algorithm performs minimum number of operations. </br>
Average Case Scenario : The expected perfommance of the algorithm when considering all inputs. </br>
Worst Case Scenario : The condition under which the algorithm performs the most number of operations. </br>

Q. Compare the time complexity of linear and binary search algorithms. </br>
ans:
1. Linear Search - Best-Case: O(1), Average-Case: O(N), Worst-Case: O(N)
2. Binary Search - Best-Case: O(1), Average-Case: O(logN), Worst-Case: O(logN)

Q. Discuss which algorithm is more suitable for your platform and why ? </br>
ans: Ecommerce platform has data that grows immensely with passing time, so an algorithm which shall give constantly the same time complexity for searching is mmore suitable. Thus, Binary Search is more suitable for my platform.
# Algorithm-Basic

>##### What is Algorithm?
>+ It is a logical and mathematical approach to solve or crack a problem using any possible method.
>+ Algorithms are generally created independent of underlying languages, i.e. an algorithm can be implemented in more than one programming language.
  <br><br>


>##### Criteria of a Algorithm:
>1. Input
>2. Output
>3. Definiteness
>4. Finiteness
>5. Effectiveness
   <br><br>


>##### Different types of Algorithms:
>+ Searching Algorithms
>+ Sorting Algorithms
>+ Divide and conquer algorithms
>+ Recursive algorithms
>+ Backtracking algorithms
>+ Brute force algorithms
>+ Greedy Algorithms
>+ Dynamic programming algorithms
<br><br>
  

>##### Application of Algorithms:
>+ Searching Data
>+ Sorting Data
>+ Find out the Shortest Path
>+ Best Possible solution
  <br><br>

>##### Complexity Analysis of Algorithm:
>+ Time Complexity
>+ Space Complexity
<br><br>
  
>##### Three Cases of Complexity Analysis:
><p align="center" >
>  <img src="https://user-images.githubusercontent.com/69858580/107119551-9351a180-68b2-11eb-9487-64a7b9cb50c3.PNG" width="600" height="300" >
></p>
>
><p align="center" >
>  <img src="https://user-images.githubusercontent.com/69858580/107119681-69e54580-68b3-11eb-9cd1-15b281d08d90.PNG" width="600" height="300" >
></p>
>
>
>+ Best case depends on the input
>+ Average case is difficult to compute 
>+ So We usually focus on worst case analysis:
>    + Easier to compute
>    + Usually close to the actual running time
>    
<br>

>##### Some common rates of growth:
>Let n be the size of input to an algorithm, and k some
constant. The following are common rates of growth-
>
><p align="center">
>  <img src="https://user-images.githubusercontent.com/69858580/107119957-f17f8400-68b4-11eb-8cf6-1421dfc33d71.PNG" width="600" height="300" >
></p>
>
><p align="center">
>  <img src="https://user-images.githubusercontent.com/69858580/107121365-2f33db00-68bc-11eb-84f6-e0b1cbd49504.PNG" width="500" height="300" >
></p>

<br>

# 1. Searching Algorithms:
>**Search for a target data from a data set.**
>
>**Searching Algorithms are designed to check for an
element or retrieve an element from any data structure
where it is stored.**
>
>+ **It is used for unsorted and unordered small list of elements.**
>+ **It has a time complexity of O(n), which means the time is linearly dependent on the number of elements, which is not bad, but not that good too.**
>+ **It has a very simple implementation.**
>
>
>###### Two possible outcomes:
>+ Target data is Found (Success)
>+ Target data is not Found (Failure)
<br> <br>

>##### Based on the type of search operation, two popular algorithms available:
>+ Linear Search / Sequential Search
>+ Binary Search
  <br> <br>
  
>### Linear Search
>Check each and every data in the list till the desired element
or value is found.
>
>Example: Suppose, we want to search 33 from the given array, Searching
will start from the first index and stop searching if the data is found or the list is over.
>
><p align="center">
>  <img src="https://user-images.githubusercontent.com/69858580/107122139-12010b80-68c0-11eb-8981-0d19b0059da3.PNG" width="500" height="100" >
></p>

>#####**~~****~~** Algorithm:
>+  Best case: O(1)
>+  Worst Case: O(n)

    // First way...
    i = 1 
    while i < n && Z != X[i] do
        i = i+1

    if i < n then
        FOUND
    else
        NOT FOUND


    // Second Way...
    flag = FALSE
    for i = 1 to n
        if A[i] == key
            flag = TRUE;
    
    if flag == TRUE
        FOUND
    else
        NOT FOUND

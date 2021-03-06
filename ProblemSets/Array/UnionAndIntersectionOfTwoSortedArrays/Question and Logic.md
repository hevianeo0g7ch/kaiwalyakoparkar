# Union And Intersection Of Two Sorted Arrays

Given two arrays **A** and **B** of size **N** and **M** respectively. The task is to find union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in union.

### Example :

```
Input :
	5 3
	1 2 3 4 5
	1 2 3

Output : 5
```
**Explanation :** 1, 2, 3, 4 and 5 are the elements which comes in the union set of both arrays. So count is 5.

### Logic :

1. #### Sets data structure ( Library function )
    - take the input as two arrays.
    - create 2 sets a1 containing 1st array, b1 containing 2nd array.
    - printing  a1. addAll ( b1 ) will show the union of the set.
    - to find intersection we have to find if all the elements in the small set is present is large set for that we will use largeSet . containsAll ( small ).
    - Print the intersection of the set.

1. #### Compare and insert
    - we will make two array list  intersection and union.
    - create visited array of size same as the small array among the a and b.
    - if element in the small array is present in the large array we will mark its location as visited [ i ] = 1 .
    - add all the elements of the large array to union arraylist.
    - then iterate through visited. and find if visited [ i ] = 1 if it is 1 then add it to intersection arraylist and if visited [ i ] = 0 then add to union arraylist .
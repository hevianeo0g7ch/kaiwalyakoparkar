# Triplet Sum In Array

Given an array arr of size **N** and an integer **K**. Find if there's a triplet in the array which sums up to the given integer **K**.

### Example :

```
Input :
	N = 6, K = 13
	arr[] = [1 4 45 6 10 8]

Output : true
```
**Explanation :** The triplet {1, 4, 8} in the array sums up to 13.

## Logic :

1. #### Brute-Force Approach
    - Given an array of length??and a sum ( n,  s ) .
    - Create three nested loop first loop runs from start to end (loop counter i), second loop runs from i+1 to end (loop counter j) and third loop runs from j+1 to end (loop counter k) .
    - The counter of these loops represent the index of 3 elements of the triplets.
    - Find the sum of ith, jth and kth element. If the sum is equal to given sum. Return true.
    - If there is no triplet, return false.

1. #### Optimal Approach
    - Sort the given array.
    - Loop over the array and fix the first element of the possible triplet, arr[i].
    - Then fix two pointers, one at i + 1 and the other at n ? 1. And look at the sum,
        - If the sum is smaller than the required sum, increment the first pointer.
        - Else, If the sum is bigger, Decrease the end pointer to reduce the sum.
        - Else, if the sum of elements at two-pointer is equal to given sum then print the triplet and break.
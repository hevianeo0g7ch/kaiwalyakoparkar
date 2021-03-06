# Minimum Swaps And K Together

Given an array of?**n**?positive integers and a number?**k**. Find the?**minimum**?number of swaps required to bring all the numbers less than or equal to?**k**?together.

### Example :

```
Input : arr[ ] = {2, 1, 5, 6, 3} and K = 3

Output : 1
```
**Explanation :** To bring elements 2, 1, 3 together, swap element '5' with '3' such that final array will be- arr[] = {2, 1, 3, 6, 5} .

### Logic :

1. #### Brute Force Approach :
    - Declare `counter = 0`
    - run a loop from `i` to last second element in the array
    - if `arr[i] > k` then run a nested loop from `j = i+1` to last element of the array until you find `arr[j] = k` .
    - if you find any such element swap `arr[i] & arr[j]` and make `counter ++` .
    - print the `counter` at last.

1. #### Two Pointer & Sliding Window Approach : 
    - Find count of all elements which are less than or equals to `k`. Let?s say the count is counter
    - Using two pointer technique for window of length `cnt`, each time keep track of how many elements in this range are greater than `k`. Let?s say the total count is `bad`.
    - Repeat step 2, for every window of length `cnt` and take minimum of count `bad` among them. This will be the final answer.
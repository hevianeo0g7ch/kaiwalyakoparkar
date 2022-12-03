# Reverse The Array

Write a program to reverse an array or string. 

### Example : 

```
Input  : arr[] = {1, 2, 3}
Output : ar[] = {3, 2, 1}
```

### Logic : ( O ^ n )

- Take two pointers **i** and **j** .
- put *i* on `arr[0]` and put **j** on `arr[arr.length-1] .
- swap **i** and **j** till **i** becomes greater than or equal to **j** .
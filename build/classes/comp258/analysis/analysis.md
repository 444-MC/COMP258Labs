## Algorithm Efficiency Analysis

The Array Manager and Linked List use different methods to remove all occurrences of a value.

**Array Manager:**

The Array Manager has a worse worst-case runtime because removing an item requires shifting the elements after it to fill the empty position. For example, if the array contains `[4, 4, 4, 4, 4]` and we want to remove all the 4s, after removing the first 4, the remaining elements need to shift left. This process happens again for each removal.

If the collection has n elements and all of them need to be removed, the number of shifts is approximately:

\[
(n-1)+(n-2)+\cdots+1+0
=\frac{n(n-1)}{2}
\]

There are also approximately n comparisons. Therefore, the total number of operations is approximately:

\[
n+\frac{n(n-1)}{2}
\]

The worst-case time complexity is **O(n²)**.

**Linked List:**

The Linked List is more efficient for this operation. It only needs to travel through the list and check each node. When it finds the value that needs to be removed, it changes the links between nodes instead of shifting all the remaining elements.

For example, if the list is `1 → 4 → 3 → 4 → 5`, removing all the 4s only requires changing the links so that the list becomes `1 → 3 → 5`.

For a collection of n elements, the algorithm needs approximately n comparisons and up to n link updates. Therefore, the total number of operations is approximately 2n, and its time complexity is **O(n)**.

**Conclusion:**

The Array Manager has the worse worst-case runtime because it may need to shift many elements after each removal. The Linked List only needs to traverse the collection once and update the links. Therefore, the Linked List is more efficient when removing all occurrences of a value, especially when the collection becomes larger.

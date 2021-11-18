# Time complexity
Every searching/sorting algorithm works by implementing comaprisons. If the item you are looking for is found at the beginning of the searching then it is the **best time complexity** else if it is found at the last element in searching, then it is **worst time complexity**. It is no big deal just this simple thing.

As the size of the input is growing, how my time is growing is called time complexity.
* O(1) is the constant time complexity.

# Linear search
	In linear searching, we start comparing at the first element and go till the last element. If we found our element at the element in the whole array, it is worst time complexity. i.e. O(n) where n--> number of elements in the array. So we have iterated through every element. Linear search when plotted onto a graph, gives linear graph. Therefore, it is called linear search.
# Binary search
	Binary search requires a sorted array either in ascending or descending order. Then it begins at the center point of the array and compares the previous element to the required element. If the previous is smaller, it automatically moves forward. if it is larger then it goes in backward direction to search. That's how binary search works.  

# Minimal-Amplitude

Remove K consecutive integers from a given array to obtain an array with minimal difference between the maximal and minimal value.

Task description

You are given an array A of N integers and an integer K. You want to remove K consecutive elements from A in such a way that the amplitude of the remaining elements will be minimal. The amplitude is the difference between the maximal and minimal elements.

Write a function:

class Solution { public int solution(int[] A, int K); }

that, given an array A of N integers and an integer K, returns an integer denoting the minimal amplitude that can be obtained after the removal of K consecutive elements from A.

Examples:

1. Given A = [5, 3, 6, 1, 3] and K = 2, the function should return 2. You can remove the third and fourth elements to obtain the following array: [5, 3, 3]. Its maximal element is 5 and its minimal element is 3, so the amplitude is 2.

2. Given A = [8, 8, 4, 3] and K = 2, the function should return 0. You can remove the third and fourth elements to obtain the array [8, 8], whose amplitude is equal to 0.

3. Given A = [3, 5, 1, 3, 9, 8] and K = 4, the function should return 1. You can remove the first, second, third and fourth elements to obtain the array [9, 8], whose amplitude equals 1.

Write an efficient algorithm for the following assumptions:

·       N is an integer within the range [3..100,000];

·       K is an integer within the range [1..N-1];

·       each element of array A is an integer within the range [0..1,000,000,000].

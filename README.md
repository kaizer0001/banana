A string S made up of uppercase English letters is given. In one move, six letters forming the word "BANANA"(one 'B', three 'A's' and two 'N's') can be deleted from S. What is the maximum number of times such a move can be applied to S?

Write a function:
def solution(s)

that given a string S of length N, returns the maximum number of moves that can be applied.

Examples:
1. Given S = "NAABXXAN", the function should return 1.

  NAABXXAN --> XX

2. Given S = "NAANAAXNABABYNNBZ", the function should return 2.

  NAANAAXNABABYNNBZ --> NAAXNABYNBZ --> XBYNZ

3. Given S = "QABAAAWOBL", the function should return 0.

  QABAAAWOBL

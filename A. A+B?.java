/*
A. A+B?
time limit per test2 seconds
memory limit per test512 megabytes
inputstandard input
outputstandard output
You are given an expression of the form a+b, where a and b are integers from 0 to 9. You have to evaluate it and print the result.

Input
The first line contains one integer t (1≤t≤100) — the number of test cases.

Each test case consists of one line containing an expression of the form a+b (0≤a,b≤9, both a and b are integers). The integers are not separated from the + sign.

Output
For each test case, print one integer — the result of the expression.

Example
inputCopy
4
4+2
0+0
3+7
8+9
outputCopy
6
0
10
17
*/

//solution
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
 public class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            String[] arr = s.split("\\+");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            System.out.println(a+b);
        }
    }
}
	

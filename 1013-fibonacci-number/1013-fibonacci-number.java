class Solution {
    public int fib(int n) { //recursion f(4)= 0 1 1 2 3
        if(n<=1) return n;

        return fib(n-1)+fib(n-2);
    }
}
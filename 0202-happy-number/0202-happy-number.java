class Solution {
    int sumofdigits(int n)
    {
        int sum = 0;
        while(n>0)
        {
            int digit = n%10;
            sum+=digit*digit;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(fast != 1)
        {
            slow = sumofdigits(slow);
            fast = sumofdigits(sumofdigits(fast));
            if(slow==fast) break;
        }
        return fast==1;
    }
}
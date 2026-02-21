class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res = 0;

        for (int i = left; i <= right; i++)
            if (isPrime(Integer.bitCount(i)))
                res++;

        return res;
    }

    public boolean isPrime(int x) {
        return (x == 2 || x == 3 || x == 5 || x == 7 || x == 11 || x == 13 || x == 17 || x == 19);
    }
}
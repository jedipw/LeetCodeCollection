class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            int current = n;
            set.add(n);
            n = 0;
            while (current > 0) {
                n += Math.pow(current % 10, 2);
                current /= 10;
            }
        }

        return n == 1;
    }
}
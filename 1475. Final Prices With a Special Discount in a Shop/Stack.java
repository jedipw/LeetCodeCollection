class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack();

        for (int i = prices.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() > prices[i]) {
                st.pop();
            }

            int discount = st.empty() ? 0 : st.peek();
            st.push(prices[i]);
            prices[i] -= discount;
        }

        return prices;
    }
}
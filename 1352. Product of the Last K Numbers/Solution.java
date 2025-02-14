class ProductOfNumbers {
    List<Integer> arr;
    int prod;

    public ProductOfNumbers() {
        arr = new ArrayList();
        prod = 1;
    }

    public void add(int num) {
        if (num == 0) {
            arr = new ArrayList();
            prod = 1;
            return;
        }
        prod *= num;
        arr.add(prod);
    }

    public int getProduct(int k) {
        if (arr.size() < k)
            return 0;
        int ans = arr.get(arr.size() - 1);
        if (k == arr.size())
            return ans;
        return ans / arr.get(arr.size() - 1 - k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
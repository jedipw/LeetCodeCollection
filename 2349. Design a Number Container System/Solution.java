class NumberContainers {
    private Map<Integer, PriorityQueue<Integer>> res;
    private Map<Integer, Integer> indexVal;

    public NumberContainers() {
        res = new HashMap<>();
        indexVal = new HashMap<>();
    }

    public void change(int index, int number) {
        if (indexVal.containsKey(index)) {
            int value = indexVal.get(index);
            if (value == number)
                return;
            res.get(value).remove(index);
        }

        res.computeIfAbsent(number, k -> new PriorityQueue<>()).offer(index);
        indexVal.put(index, number);
    }

    public int find(int number) {
        PriorityQueue<Integer> pq = res.getOrDefault(number, new PriorityQueue<>());
        return pq.isEmpty() ? -1 : pq.peek();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList();
    }

    public int ping(int t) {
        while (queue.size() != 0 && queue.peek() < t - 3000) {
            queue.remove();
        }

        queue.add(t);

        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
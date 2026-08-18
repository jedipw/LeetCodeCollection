class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int accSec = requests[0];

        for (int i = 1; i < requests.length; i++) {
            accSec += Math.abs(requests[i] - requests[i - 1]);
        }

        return accSec;
    }
}
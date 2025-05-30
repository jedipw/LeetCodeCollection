class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int total = 0;
        Arrays.sort(seats);
        Arrays.sort(students);

        for (int i = 0; i < seats.length; i++) {
            total += Math.abs(students[i] - seats[i]);
        }

        return total;
    }
}
class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (vowels.contains(s.charAt(i))) {
                if (i < n / 2) {
                    count++;
                } else {
                    count--;
                }
            }
        }

        return count == 0;
    }
}
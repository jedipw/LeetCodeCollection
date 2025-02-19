class Solution {
    List<String> list = new ArrayList();

    public String getHappyString(int n, int k) {
        generateHappyStrings(n, "");

        if (list.size() < k)
            return "";

        Collections.sort(list);

        return list.get(k - 1);
    }

    protected void generateHappyStrings(int n, String currentString) {
        if (currentString.length() == n) {
            list.add(currentString);
            return;
        }

        for (char c = 'a'; c <= 'c'; c++) {
            if (currentString.length() > 0 && currentString.charAt(currentString.length() - 1) == c) {
                continue;
            }

            generateHappyStrings(n, currentString + c);
        }
    }
}
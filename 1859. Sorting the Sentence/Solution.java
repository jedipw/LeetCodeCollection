class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] resArr = new String[words.length];
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            resArr[Character.getNumericValue(word.charAt(word.length() - 1)) - 1] = word.substring(0,
                    word.length() - 1);
        }

        int i;
        for (i = 0; i < resArr.length - 1; i++) {
            sb.append(resArr[i]).append(" ");
        }
        sb.append(resArr[i]);

        return sb.toString();
    }
}
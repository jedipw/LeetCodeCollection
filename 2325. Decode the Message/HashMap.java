class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder sb = new StringBuilder();

        HashMap<Character, Character> map = new HashMap();

        char keyName = 'a';
        for (char c : key.replaceAll(" ", "").toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, keyName++);
            }
        }

        for (char c : message.toCharArray()) {
            if (!Character.isWhitespace(c))
                sb.append(map.get(c));
            else
                sb.append(' ');
        }

        return sb.toString();
    }
}
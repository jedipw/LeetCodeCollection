class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int key = 0;

        switch (ruleKey) {
            case "type":
                key = 0;
                break;
            case "color":
                key = 1;
                break;
            case "name":
                key = 2;
        }

        for (List<String> item : items) {
            if (ruleValue.equals(item.get(key)))
                count++;
        }

        return count;
    }
}
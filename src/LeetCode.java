import java.util.List;

public class LeetCode {
    public static void main(String[] args) {
        class Solution {

            public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
                int cnt = 0;
                for (int i = 0; i < items.size(); i++) {
                    if (ruleKey.equals("type")) {
                        if (items.get(i).get(0).equals(ruleValue)) {
                            cnt++;
                        }
                    } else if (ruleKey.equals("color")) {
                        if (items.get(i).get(1).equals(ruleValue)) {
                            cnt++;
                        }
                    } else if (ruleKey.equals("name")) {
                        if (items.get(i).get(2).equals(ruleValue)) {
                            cnt++;
                        }
                    }
                }
                return cnt;
            }
        }
    }
}

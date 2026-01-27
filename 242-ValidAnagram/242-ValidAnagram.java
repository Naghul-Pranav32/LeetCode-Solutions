// Last updated: 1/27/2026, 2:59:27 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> hm1 = new HashMap();
        for (char ch : s.toCharArray()) hm1.put(ch, hm1.getOrDefault(ch,0) + 1);
        for (char ch : t.toCharArray()) hm1.put(ch, hm1.getOrDefault(ch, 0) - 1);
        for (int x : hm1.values()) if (x != 0) return false;
        return true;
    }
}
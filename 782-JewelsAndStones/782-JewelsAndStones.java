// Last updated: 1/27/2026, 2:58:52 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> hm = new HashMap();
        int count = 0;
        for (char ch : jewels.toCharArray()) hm.put(ch, 0);
        for (char ch : stones.toCharArray()) 
            if (hm.containsKey(ch)) hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        for (int i : hm.values()) count += i;
        return count;
    }
}
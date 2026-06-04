// Last updated: 6/4/2026, 10:42:35 AM
class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map <String, Integer> hm1 = new HashMap <>();
        Map <String, Integer> hm2 = new HashMap <>();
        for (String ch : words1) hm1.put(ch, hm1.getOrDefault(ch, 0) + 1);
        for (String ch : words2) hm2.put(ch, hm2.getOrDefault(ch, 0) + 1);
        int count = 0;
        for (String ch : hm2.keySet()) 
            if (hm1.getOrDefault(ch, 0) == 1 && hm2.get(ch) == 1) count++;
        return count;
    }
}
// Last updated: 4/19/2026, 8:46:46 PM
class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Character, Integer> hm = new HashMap<>();
        String ns = String.valueOf(n);
        int result = Integer.MAX_VALUE;
        int minfreq = Integer.MAX_VALUE;
        for (char ch : ns.toCharArray()) hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        for (int num : hm.values()) minfreq = Math.min(minfreq, num);
        for (char ch : hm.keySet()) {
            if (hm.get(ch) == minfreq) {
                result = Math.min(result, ch - '0');
            }
        }
        return result;
    }
}
// Last updated: 4/19/2026, 8:46:33 PM
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Map <Integer, Integer> hm = new HashMap<>();
        List <Integer> result = new ArrayList<>();
        for (int i : bulbs) hm.put(i, hm.getOrDefault(i, 0) + 1);
        for (int i : hm.keySet()) 
            if (hm.get(i)%2 != 0) result.add(i);
        Collections.sort(result);
        return result;
    }
}
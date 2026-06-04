// Last updated: 6/4/2026, 10:42:49 AM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int arr[] = new int[26];
        int count = 0;
        for (char i : allowed.toCharArray()) arr[i - 'a'] = 1;
        for (String word : words) count += findConsistentString(arr, word);
        return count;
    }
    public static int findConsistentString(int[] arr, String k) {
        int flag = 1;
        for (int i = 0; i < k.length(); i++) {
            if (arr[k.charAt(i) - 'a'] == 0) {
                flag = 0;
                break;
            }
        }
        return flag;
    }
}
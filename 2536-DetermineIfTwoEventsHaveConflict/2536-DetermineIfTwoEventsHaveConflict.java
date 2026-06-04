// Last updated: 6/4/2026, 12:52:16 PM
class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        return event1[1].compareTo(event2[0]) >= 0 && event2[1].compareTo(event1[0]) >= 0;
    }
}
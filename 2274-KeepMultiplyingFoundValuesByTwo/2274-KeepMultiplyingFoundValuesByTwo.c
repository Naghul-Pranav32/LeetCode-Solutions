// Last updated: 1/27/2026, 2:58:11 PM
int findFinalValue(int* nums, int numsSize, int original) {
    int i = 0;
    while (i < numsSize) {
        if (nums[i] == original) {
            original *= 2;
            i = 0;
        } else {
            i++;
        }
    }
    return original;
}
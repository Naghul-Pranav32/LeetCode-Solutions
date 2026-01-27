// Last updated: 1/27/2026, 3:00:17 PM
int removeElement(int* nums, int numsSize, int val) {
   int i,j=0;
   for (i=0;i<numsSize;i++) {
    if (nums[i]!=val) {
        nums[j]=nums[i];
        j++;
    }
   }
   return j;
}
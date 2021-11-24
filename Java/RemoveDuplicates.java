public class RemoveDuplicates {
  public static void main(String args[]){
    int[] nums1 = {1, 1, 2};
    int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int[] nums3 = {};
    int[] nums4 = {1};
    int[] nums5 = {1, 1};
    int[] nums6 = {1, 2};
    int[] nums7 = {-3, -1, 0, 0, 0, 3, 3};


    System.out.println("Test 1: {1, 1, 2} = " + removeDuplicates(nums1) + "\n");
    System.out.println("Test 2: {0, 0, 1, 1, 1, 2, 2, 3, 3, 4} = " + removeDuplicates(nums2) + "\n");
    System.out.println("Test 3: { } = " + removeDuplicates(nums3) + "\n");
    System.out.println("Test 4: {1} = " + removeDuplicates(nums4) + "\n");
    System.out.println("Test 5: {1, 1} = " + removeDuplicates(nums5) + "\n");
    System.out.println("Test 6: {1, 2} = " + removeDuplicates(nums6) + "\n");
    System.out.println("Test 7: {-3, -1, 0, 0, 0, 3, 3} = " + removeDuplicates(nums7) + "\n");
  }

  public static int removeDuplicates(int[] nums){
    int curr=0,next=1;
    while(next < nums.length){
      if(nums[curr] == nums[next])
        next++;
      else
        nums[++curr]=nums[next];
      }
    return curr+1;
  }
}
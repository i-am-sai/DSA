public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {

        int ans = nums[0];

        for(int i =0; i<nums.length-1; i++){
            for(int j =1; j<nums.length; j++){
                if(nums[i] == nums[j] && i != j){
                    ans = nums[i];
                    return ans;
                }

            }
        }
        return ans;
    }
}

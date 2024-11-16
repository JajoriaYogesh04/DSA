import java.util.ArrayList;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg= new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }
        int posptr= 0;
        int negptr= 0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                nums[i]= pos.get(posptr);
                posptr++;
            }
            else{
                nums[i]= neg.get(negptr);
                negptr++;
            }
        }
        return nums;
    }
}
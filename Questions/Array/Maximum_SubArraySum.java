public class Maximum_SubArraySum {
        public int maxSubArray(int[] nums) {
            if(nums.length == 0){
                return 0;
            }
            int currentSum = 0;
            int maxSubArraySum = Integer.MIN_VALUE;
            for(int i = 0 ; i < nums.length;i++){
                currentSum  += nums[i];
                maxSubArraySum = Math.max(currentSum,maxSubArraySum);
                if(currentSum < 0){
                    currentSum = 0 ;
                } 
            }
              return maxSubArraySum ;
        }
        public static void main (String[] args){
            Maximum_SubArraySum obj = new Maximum_SubArraySum();
            int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
            System.out.println(obj.maxSubArray(arr));
        }
}
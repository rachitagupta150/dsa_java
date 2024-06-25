public class concatenation_of_array_1929 {
    public static void main(String[] args){
        int nums[]={1,3,2,1};
        int ans[]=new int[2*nums.length];
        for(int i=0;i<ans.length;i++){
            if(i<nums.length){
                ans[i]=nums[i];
                System.out.print(ans[i]+" ");
            }
            else{
                ans[i]=nums[i-nums.length];
                System.out.print(ans[i]+" ");
            }
        }
       
    }
}

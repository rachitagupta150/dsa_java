public class count_number_of_nice_subarrays_1248{
    public static void main(String[] args){
        int nums[]={1,1,2,1,1};
        int k=3;
        for(int i=0;i<nums.length;i++){
            nums[i]%=2;
        }
        int precount[]=new int[nums.length +1];
        precount[0]=1;
        int s=0, ans=0;
        for(int i:nums){
            s+=i;
            if(s>=k){
                ans+= precount[s-k];
            }
            
            precount[s]++;
        }
        System.out.println(ans);
    }
}
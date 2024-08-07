public class min_cost_climbing_stairs_746 {
    public static void main(String[] args){
        int arr[]={1,100,1,1,1,100,1,1,100,1};
        int ans= minCostClimbingStairs(arr);
        System.out.println(ans);
    }
    public static int minCostClimbingStairs(int[] arr) {
        int n=arr.length;
        int first=arr[0];
        int second=arr[1];
        if(n<=2){
            return Math.min(first,second); 
        }
        for(int i=2;i<n;i++){
            int curr=arr[i] + Math.min(first,second);
            first=second;
            second=curr;
        }
        return Math.min(first,second);
    }
    
}
public class knapsac {

    public static void main(String[] args){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int w=7;
        
        int max=maxprofit(val,wt,w,val.length);
        System.out.println(max);
    }
    public static int maxprofit(int val[],int wt[], int w, int n){
        if(n==0 || w==0){
            return 0;
        }
        
        if(wt[n-1]<=w){
            int ans1=val[n-1]+maxprofit(val, wt ,w-wt[n-1],n-1);
            int ans2=maxprofit(val, wt ,w,n-1);
            return Math.max(ans1,ans2);
            
        }
        else{
            return maxprofit(val, wt, w, n-1);
            
        }
    }
}





//dp memoisation approch
// public class knapsac {

//     public static void main(String[] args){
//         int val[]={15,14,10,45,30};
//         int wt[]={2,5,1,3,4};
//         int w=7;
//         int dp[][]=new int [val.length+1][w+1];
        
//         for(int i=0;i<dp.length;i++){
//             for(int j=0;j<dp[0].length;j++){
//                 dp[i][j]=-1;
//             }
//         }
//         int max=maxprofit(val,wt,w,val.length,dp);
//         System.out.println(max);
//     }
//     public static int maxprofit(int val[],int wt[], int w, int n,int dp[][]){
//         if(n==0 || w==0){
//             return 0;
//         }
//         if(dp[n][w]!=-1){
//             return dp[n][w];
//         }
//         if(wt[n-1]<=w){
//             int ans1=val[n-1]+maxprofit(val, wt ,w-wt[n-1],n-1,dp);
//             int ans2=maxprofit(val, wt ,w,n-1,dp);
//             dp[n][w]= Math.max(ans1,ans2);
//             return dp[n][w];
//         }
//         else{
//             dp[n][w] =maxprofit(val, wt, w, n-1,dp);
//             return dp[n][w];
//         }
//     }
// }
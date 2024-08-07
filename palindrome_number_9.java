public class palindrome_number_9{
    public static void main(String[] args){
        int x=81218;
        int temp=x;
        int r=0,sum=0;
        while(x!=0){
            r=x%10;    
            sum=(sum*10)+r;    
            x=x/10;  
        }
        if(sum==temp){
            
            System.err.println("yes palindrome");
        }
        else{
            System.err.println("no it is not a palindrome");
        }
    }
}
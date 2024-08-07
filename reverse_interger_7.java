public class reverse_interger_7{
    public static void main(String[] args){
        int x=-326;
        boolean flag=false;
        if(x>0){
            flag=true;
        }
        int r=0,sum=0;
        while(x!=0){
            r=x%10;    
            sum=(sum*10)+r;    
            x=x/10;  
        }
        if(flag==false){
            sum=0-sum;
        }
        System.out.println(sum);
    }
}
public class reverse_words_in_a_string_151 {
    public static void main(String[] args){
        String s="the sky is blue";
        String[] str=s.trim().split("\\s+");
        String out="";
        for(int i=str.length-1;i>0;i--){
            out+=str[i]+" ";
        }
        System.out.println(out + str[0]);
    }
}

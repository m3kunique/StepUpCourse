public class Sum {
    public static void main(String[] args) {
        double sum=0;
        for(String s:args){
            try{
                sum+=Double.parseDouble(s);
            }catch(NumberFormatException _){}
        }
        System.out.println(sum);
    }
}

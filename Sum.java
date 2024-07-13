public class Sum {
    public static void main(String[] args) {
        double sum=0;
        for(String s:args){
            if (s.matches("-?\\d+(\\.\\d+)?"))
                sum+=Double.parseDouble(s);
        }
        System.out.println(sum);
    }
}

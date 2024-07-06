package OOP;

public class StringWrapper implements Lengthable{
    private String[] strs;

    public StringWrapper(String... strs) {
        this.strs=strs;
    }

    @Override
    public double length() {
        double sum = 0;
        for (String str : strs) {
            sum+=str.length();
        }
        return sum;
    }
}

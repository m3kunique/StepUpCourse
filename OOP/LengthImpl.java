package OOP;

public class LengthImpl{
    public double getLength(Lengthable... ob) {
        double sum = 0;

        for (Lengthable len : ob) sum+= len.length();
        return sum;
    }
    public double getLength(String str, Lengthable... ob) {
        return this.getLength(ob)+str.length();
    }
}

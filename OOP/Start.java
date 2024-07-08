package OOP;

public class Start {
    public static void main(String[] args) {
        birdMarket(new Parrot("мяу я котик"), new Parrot("ку-ку"), new Sparrow());
        }
    public static void birdMarket(Birds...birds){
        for (Birds b: birds) {
            b.sing();
        }
    }
}

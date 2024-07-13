package OOP.Enum;

public class Sauce {
    String name;
    Hotness hotness;

    public Sauce(String name, Hotness hotness) {
        this.name = name;
        this.hotness = hotness;
    }

    @Override
    public String toString() {
        return String.format("Соус %s: %s", name, hotness);
    }
}

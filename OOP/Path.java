package OOP;

public class Path {
    private City city;
    private int cost;

    public Path(City city, int coast) {
        this.city = city;
        this.cost = coast;
    }

    public City getCity(){
        return city;
    }

    public int getCost(){
        return cost;
    }

    public String toString() {
        return String.format("%s : %d", city.getName(), cost);
    }

}

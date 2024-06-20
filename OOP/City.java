package OOP;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<Path> paths;


    public City(String cityName) {
        this.name = cityName;
        this.paths = new ArrayList<>();
    }

    public City(String cityName, List<Path> paths) {
        this.name = cityName;
        this.paths = paths;
    }

    public String getName() {
        return name;
    }

    public void addPath(City city, int cost) {
        this.paths.add(new Path(city, cost));
    }

    public void addPath(Path path) {
        this.paths.add(path);
    }

    public List<Path> getPaths() {
        return paths;
    }

    public City travel(int n) {
        City currentCity = this;
        for (int i = 0; i < n; i++) {
            if (currentCity.paths.isEmpty()) {
                return null; // No further paths available
            }
            currentCity = currentCity.paths.getFirst().getCity();
        }
        return currentCity;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", paths=" + paths +
                '}';
    }
}

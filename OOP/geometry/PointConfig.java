package OOP.geometry;
import java.util.HashMap;
import java.util.Map;

public class PointConfig {
    private Map<String, Object> characteristics;

    public PointConfig() {
        this.characteristics = new HashMap<>();
    }

    public void setX(int x) {
        characteristics.put("x", x);
    }

    public void setY(int y) {
        characteristics.put("y", y);
    }

    public void setZ(int z) {
        characteristics.put("z", z);
    }

    public void setColor(String color) {
        characteristics.put("color", color);
    }

    public void setTime(String time) {
        characteristics.put("time", time);
    }

    public Object getCharacteristic(String name) {
        return characteristics.get(name);
    }

    public void setCharacteristic(String name, Object value) {
        characteristics.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Point: ");
        for (Map.Entry<String, Object> entry : characteristics.entrySet()) {
            sb.append(entry.getKey()).append("=").append(entry.getValue()).append(", ");
        }
        if (sb.length() > 2) {
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }

}

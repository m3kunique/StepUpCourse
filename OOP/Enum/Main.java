package OOP.Enum;

public class Main {
    public static void main(String[] args) {
        System.out.println(op.DIV.operation(1,2));

    }

    enum op {
        SUM {
            double operation(int x, int y) {
                return x + y;
            }
        }, SUB {
            double operation(int x, int y) {
                return x - y;
            }
        }, MULT {
            double operation(int x, int y) {
                return x * y;
            }
        }, DIV {
            double operation(int x, int y) {
                return (double) x / y;
            }
        };
        abstract double operation(int x, int y);
    }

    public static class trafficLight {
        int x;
        Light light;

        public trafficLight(Light light) {
            this.light = light;
            x = light.x;
        }

        public Light current() {
            return light;
        }

        public Light next() {
            if (light.x == 2) {
                if (x == 1 || x == 2) {
                    light = Light.RED;
                    x = light.x;
                    return light;
                } else if (x == 3) {
                    light = Light.GREEN;
                    x = light.x;
                    return light;
                }
            }
            light = Light.YELLOW;
            return light;
        }
    }

    enum Light {
        GREEN(1), YELLOW(2), RED(3);
        int x;

        Light(int x) {
            this.x = x;
        }
    }
}

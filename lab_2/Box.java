import java.util.ArrayList;

class Box extends Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double access;
    private double volume;

    public Box(double access) {
        this.access = access;
        this.volume = access;
    }

    public boolean add(Shape shape) {
        if (access >= shape.getVolume()) {
            shapes.add(shape);
            access -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }

    public double info() {
        return access;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    public String toString(double x, double y) {
        String result = "";

        result = result + "Объем: " + x + " | " + "Всего осталось: " + y;
        return result;
    }
}
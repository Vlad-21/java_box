import java.util.ArrayList;
public class Box {
    private double volume; // об'єм, який є в Box
    private double maxVolume; // максимальний об'єм Box
    private ArrayList<Shape> shapes; // список фігур у Box

    public Box(double maxVolume) {
        this.maxVolume = maxVolume;
        this.volume = 0;
        this.shapes = new ArrayList<>();
    }

    public boolean add(Shape shape) {
        double shapeVolume = shape.getVolume();
        if (volume + shapeVolume <= maxVolume) { // якщо місця достатньо
            volume += shapeVolume;
            shapes.add(shape);
            return true;
        }
        return false;
    }
}

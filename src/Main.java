public class Main {
    public static void main(String[] args) {
        Box box = new Box(100);
        Sphere sphere = new Sphere(5);
        Square cube = new Square(4);

        box.add(sphere);
        box.add(cube);

        System.out.println(box.add(new Sphere(10)));
    }
}
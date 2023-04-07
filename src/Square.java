public class Square extends Shape{
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getVolume() {
        return Math.pow(sideLength, 3);
    }
}

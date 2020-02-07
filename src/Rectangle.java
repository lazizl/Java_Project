public class Rectangle {
    private double Length;
    private double Width;

    public Rectangle(double length, double width) {
        Length = length;
        Width = width;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
        Length = length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getArea() {
        return Length * Width;
    }

    public double getDiagonal() {
        return Math.sqrt(Length * Length + Width * Width);
    }

    public boolean isSquare() {
        if (Length == Width) {
            return true;
        }
        return true;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + Length +
                ", width='" + Width + '\'' +
                '}';
    }
}

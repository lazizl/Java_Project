public class Runner {
    public static void main(String[]args) {
        Car myCar = new Car(2019, "Mercedez", 1000, "glc");
        System.out.println(myCar.toString());
        myCar.drive(30000);
        System.out.println(myCar.toString());

        Rectangle myNonSquare= new Rectangle(5,7);
        System.out.println(myNonSquare.toString());
        System.out.println(myNonSquare.getArea());
        myNonSquare.getDiagonal();
        System.out.println(myNonSquare.getDiagonal());
        myNonSquare.isSquare();
        System.out.println(myNonSquare.isSquare());

    }
}




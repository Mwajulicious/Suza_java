public class MyOwnAutoShop {
    int speed ;double regularPrice;String color; int year; int manufacturerDiscount ;
    public static void main(String[] args) {
        Sedan Sedan = new Sedan(123, 67400.0, "purpule", 10);
        Ford Ford1 = new Ford (967,6329.0,"white",2005, 10);
        Ford Ford2 = new Ford (932,19200.0,"yellow",1998, 5);
        Car Car = new Car (856, 726519.0, "blue");
        System.out.println("The Ford1 price " + Sedan.getSalePrice());
        System.out.println(" The Sedan price"+ Ford1.getSalePrice());
        System.out.println("This Ford2 price "+ Ford2.getSalePrice());
        System.out.println("This Car price "+ Car.getSalePrice());
    }
}
//public class Multiplication {
//    final static int x;
//    int count = 0;
//    static {
//        x = 10;
//        new Multiplication(10);
//    }
//    Multiplication(int x) {
//        System.out.println(++count * x);
//    }
//
//    public static void main(String[] args) {
//        Multiplication multiplication = new Multiplication(30);
//    }
//}
class Multiplication {
    static int x = 10;
    static {
        x += 10;
    }
    Multiplication(int x) {
        x += Multiplication.x;
        System.out.println(x * this.x);
    }

    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication(10);
    }
}
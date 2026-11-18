public class Main {
    static void main() {
        System.out.println("hola mundo");
        System.out.println(restar(5,2));
      System.out.println(sumar(7, 10));
        System.out.println(division(10,2));
    }

    private static int restar(int a, int b){
        return a - b;
    }


    private static int sumar(int a, int b) {
        return a + b;
    }

    private static int division(int a, int b) {
        return a / b;
    }
}

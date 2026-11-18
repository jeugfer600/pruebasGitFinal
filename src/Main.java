public class Main {
    static void main() {
        System.out.println("hola mundo");
        System.out.println(restar(5, 2));
        System.out.println(sumar(7, 10));
        System.out.println(multiplicar(5, 10));
    }

    private static int restar(int a, int b) {
        return a - b;
    }


    private static int sumar(int a, int b) {
        return a + b;
    }

    private static int multiplicar(int a, int b) {
        return a * b;
    }
}

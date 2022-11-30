public class Main {
    public static void main(String[] args) {
        int resultSum = sum(10, 20, 30);
        System.out.println(resultSum);

        Coche miCoche = new Coche(2);
        miCoche .addOneDoor();
        System.out.println(miCoche .getPuertas());
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
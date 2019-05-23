public class Main {
    public static void main(String[] args) {
        double a = 0;
        while (a <= 3.1) {
            System.out.printf("%.1f ", a);
            a += 0.1;
        }
        a = 0;
        System.out.println();
        do {
            System.out.printf("%.1f ", a);
            a += 0.1;
        } while (a <= 3.1);

    }
}
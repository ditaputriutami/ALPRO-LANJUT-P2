public class Latihan4 {

    public static void main(String[] args) {
        System.out.println("Pengulangan Membentuk Pola");
        for (int i = 5; i >= 1; i--) {
            for (int k = 5; k > i; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("UTDI");
        }
    }
}
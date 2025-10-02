public class bai4 {
    public static void main(String[] args) {
        System.out.println("n\tln n\tn\t n ln n\t n^2\t\t n^3\t\t 2^n");
        for (int n = 16; n <= 2048; n *= 2) {
            double ln = Math.log(n);              // natural log
            double nln = n * Math.log(n);         // n ln n
            double n2 = Math.pow(n, 2);           // n^2
            double n3 = Math.pow(n, 3);           // n^3
            double pow2n = Math.pow(2, n);        // 2^n
            System.out.printf(
                    "%d\t%.4f\t%d\t%.4f\t%.0f\t%.0f\t%.0f%n",
                    n, ln, n, nln, n2, n3, pow2n
            );
        }
    }
}

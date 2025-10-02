public class bai2 {
    public static void main(String[] args) {
        double r = Math.random();
        int roll;
        if      (r < 1.0 / 8.0) roll = 1;   // 1/8
        else if (r < 2.0 / 8.0) roll = 2;   // 1/8
        else if (r < 3.0 / 8.0) roll = 3;   // 1/8
        else if (r < 4.0 / 8.0) roll = 4;   // 1/8
        else if (r < 5.0 / 8.0) roll = 5;   // 1/8
        else                     roll = 6;   // 3/8
        System.out.println(roll);
    }
}

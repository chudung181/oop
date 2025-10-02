public class bai3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương!");
            return;
        }

        String s = "";
        for (int i = n; i > 0; i /= 2) {
            s = (i % 2) + s;  // nối bit vào đầu chuỗi
        }

        System.out.println("Biểu diễn nhị phân của " + n + " là: " + s);
    }
}

public class bai5 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E"};
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}

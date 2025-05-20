public class Main {
    public static void main(String[] args) {
        int a = 1, b = 0, c = -1; // Example numbers
        if (a < b && b < c) {
            System.out.println("Increasing");
        } else if (a > b && b > c) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither");
        }
    }
}
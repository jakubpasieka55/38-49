public class Main {
    public static void main(String[] args) {
        String input = "Hello, world!";
        char toRemove = 'o';
        String result = input.replace(String.valueOf(toRemove), "");
        System.out.println(result);
    }
}
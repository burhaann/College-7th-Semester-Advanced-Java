public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Error has Aklread");
        }
    }
}
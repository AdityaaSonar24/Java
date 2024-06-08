public class JumpDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // or continue
            }
            System.out.println("value is " + i);
        }
    }
}

public class SelectionDemo {
    public static void main(String[] args) {
        /*
         * int m=6;
         * 
         * if (m % 2 == 0)
         * 
         * System.out.println("even");
         * 
         * if (m % 2 != 0) //else
         * 
         * System.out.println("odd");
         * 
         * if (m == 0)
         * System.out.println("Nothing");
         * 
         * else if (m % 2 == 0)
         * System.out.println("Even");
         * else
         * System.out.println("Odd");
         */
        // TERNARY OPEARTORY CODE
        // ?: -> condition?expr1:expr2
        // int i = 5;
        // int j = 0;
        // j = i > 6 ? 1 : 2;

        // System.out.println(j);

        // switch case code
        int i = 5;

        switch (i) {
            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;

            case 3:
                System.out.println("three");
                break;

            case 4:
                System.out.println("four");
                break;

            case 5:
                System.out.println("five");
                break;

            default:
                System.out.println("unknown");
                break;
        }

    }
}

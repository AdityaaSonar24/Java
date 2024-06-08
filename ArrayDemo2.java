public class ArrayDemo2 {

    public static void main(String[] args) {
        int a[] = { 2, 3, 4, 5 };
        int b[] = { 1, 5, 4, 7 };
        int c[] = { 2, 9, 5, 8 };

        int d[][] = {

                { 2, 3, 4, 5 },
                { 1, 5, 4, 7 },
                { 2, 9, 5, 8 }

        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print("  " + d[i][j]);
            }
        }
    }
}

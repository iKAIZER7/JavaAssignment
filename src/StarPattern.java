public class StarPattern {
    public static void main(String[] args) {
        int maxStars = 9;

        // Upper half including middle
        for (int i = 1; i <= maxStars; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half
        for (int i = maxStars - 2; i >= 1; i -= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

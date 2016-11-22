public class looping {
    public static void main (String[] args) {
        int limit = 6;
        int sum = 0;

        for (int i=1; i<=limit; i++) {
            System.out.println(sum);
            sum += i;
        }
    }
}
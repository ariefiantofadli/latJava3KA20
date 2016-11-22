public class andif {
    public static void main (String[] args) {
        int value = 8;
        int count = 10;
        int limit = 11;

        //if (++value%2 != 0 && ++count < limit) {
        if (value++%2 != 0) {
            System.out.println("Here");
            System.out.println(value);
            System.out.println(count);
        }
        System.out.println("There");
        System.out.println(value);
        System.out.println(count);
    }
}
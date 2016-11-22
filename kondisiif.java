public class kondisiif {
    public static void main(String[] args) {
        int a = 2;
        if (a==0) {
            System.out.println("In the Block");
            
            if (a==2) {
                System.out.println("A is 0");
            }
            else {
                System.out.println("A is not 2");
            }
        }
        else {
            System.out.println("A is not 0");
        }
    }
}
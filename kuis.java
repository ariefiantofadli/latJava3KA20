public class kuis
{
    public static void main(String args[])
    {
        String kata1 = new String ("FADLI");
        String kata2 = new String ("ARIEF");
        Integer A = 5;

        int len = kata1.length();
        System.out.println("Jumlah huruf: " + len);

        String kata3 = new String ("Universitas Gunadarma");
        System.out.println(kata3);

        System.out.print("Hasil startsWith: ");
        System.out.println(kata3.startsWith("Universitas"));

        System.out.print("Hasil endsWith: ");
        System.out.println(kata3.endsWith("Universitas"));

        System.out.print("Hasil replace: ");
        System.out.println(kata3.replace('a','Z'));

        System.out.print("Hasil concat: ");
        System.out.println(kata1 + kata2);

        System.out.print("Hasil equals: ");
        System.out.print(A.equals(len));
    }
}
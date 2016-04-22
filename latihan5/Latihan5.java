package latihan5;
public class Latihan5 {
    
    private static String nama, alamat, telepon;
    private static int id = 1;
    public final int jmlhtamu = 15;
    
    public Latihan5(){
        nama = "";
        alamat = "";
        telepon = "";
    }
    public boolean getID(){
        double temp = id;
        if (temp <= jmlhtamu){
            id = id;
            return true;
        } else {
            return false;
        }
    }
    public static void showdata ( String n, String a, String t){
        System.out.println("   Buku Tamu   ");
        System.out.println("Nama       : " + n);
        System.out.println("Alamat     : " + a);
        System.out.println("No.Telepon : " + t);
        System.out.println("No.ID      : " + id++);
    }
}

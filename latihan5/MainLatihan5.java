package latihan5;
import java.util.Scanner;
public class MainLatihan5 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Latihan5 book1 = new Latihan5();
        while(book1.getID()==true){
         
            System.out.print("Masukkan Nama       : ");
            String n = in.nextLine();
            System.out.print("Masukkan Alamat     : ");
            String a = in.nextLine();
            System.out.print("Masukkan No.Telepon : ");
            String t = in.nextLine();
            Latihan5.showdata(n, a, t);
            System.out.println();
        }
    }
}

//Driver Class
import java.util.Scanner;

public class TesSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("ID : ");
        int id = in.nextInt();
        System.out.println("IPK : ");
        double ipk = in.nextDouble();

        Siswa ari = new Siswa(id, nama, ipk);
        Siswa rama = new Siswa(2, "Rama", 90);
        if(ari.getIpk() < rama.getIpk()) {
            System.out.println("IPK Rama lebih tinggi");
        } else {
            System.out.println("IPK Ari lebih tinggi");
        }

        //Nilai diatas 75 lulus
        if (ari.getIpk() >= 75) {
            System.out.println(ari.getNama() + " Lulus");
        } else {
            System.out.println(ari.getNama() + " tidak Lulus");
        }

        //Nilai Huruf
        if (ari.getIpk() < 60) {
            System.out.println("E");
        } else if (ari.getIpk() > 60 && ari.getIpk() <= 70) {
            System.out.println("D");
        }


        in.close();
    }
}

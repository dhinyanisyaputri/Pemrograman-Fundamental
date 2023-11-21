import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class Percabangan {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
        out.print("Masukkan Nilai Huruf: ");
        String nilaiHuruf = scanner.next();
        double nilaiIndeks;
		
		 // Mengkonversi nilai huruf ke nilai indeks menggunakan if-else
		if (nilaiHuruf.equals("A")) {
            nilaiIndeks= 4.0;
        } else if (nilaiHuruf.equals("B")) {
            nilaiIndeks = 3.0;
        } else if (nilaiHuruf.equals("C")) {
            nilaiIndeks = 2.0;
        } else if (nilaiHuruf.equals("D")) {
            nilaiIndeks = 1.0;
        } else if (nilaiHuruf.equals("G")) {
            nilaiIndeks = 0.0;
        }else {
            System.out.println("Maaf, konversi nilai tidak diketahui.");
            return;// Keluar dari program jika nilai tidak valid
        }
		// Menampilkan hasil konversi
		System.out.println("Nilai indeks Anda adalah: " + nilaiIndeks);
		
	}
}
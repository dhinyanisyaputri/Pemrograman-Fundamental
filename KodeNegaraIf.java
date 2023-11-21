import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class KodeNegaraIf {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
        out.print("Masukkan Kode Negara: ");
        String kodeNegara = scanner.next();
       
		String namaNegara;
		
		if (kodeNegara.equals("ES")) {
            namaNegara = "Spain";
        } else if (kodeNegara.equals("TN")) {
            namaNegara = "TUNISIA";
        } else if (kodeNegara.equals("ID")) {
            namaNegara = "INDONESIA";
        } else if (kodeNegara.equals("MM")) {
            namaNegara = "Myanmar";
        } else if (kodeNegara.equals("IN")) {
            namaNegara = "INDIA";
        }else {
            out.println("Maaf, kode negara TIDAK DIKETAHUI");
            return;
			// Keluar dari program jika nilai tidak valid
        }

			out.println("Nama negara: " + namaNegara);
		
	}
}
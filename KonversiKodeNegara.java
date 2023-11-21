import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class KodeNegara {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

        out.print("Masukkan kode negara: ");
        String kodeNegara = scanner.nextLine();

        String namaNegara;
        switch (kodeNegara) {
		case "ES":
                namaNegara = "Spain";
                break;
            case "TN":
                namaNegara = "TUNISIA";
                break;
            case "ID":
                namaNegara = "INDONESIA";
                break;
            case "MM":
                namaNegara = "Myanmar";
                break;
            case "IN":
                namaNegara = "INDIA";
                break;
            default:
                namaNegara = "Maaf, kode negara TIDAK DIKETAHUI";
                break;
        }
		
		out.println("Nama negara: " + namaNegara);
	}
}
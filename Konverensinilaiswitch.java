import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class NilaiHurufSwitch {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

        out.print("Masukkan nilai huruf: ");
        String nilaiHuruf = scanner.nextLine();

        String nilaiIndex;
        switch (nilaiHuruf) {
		case "A":
                nilaiIndex = "4.0";
                break;
            case "B":
                nilaiIndex = "3.0";
                break;
            case "C":
                nilaiIndex = "2.0";
                break;
            case "D":
                nilaiIndex = "1.0";
                break;
            case "F":
                nilaiIndex = "0.0";
                break;
            default:
                nilaiIndex = "Maaf, konversi nilai tidak diketahui";
                break;
        }
		
		out.println("Nilai index: " + nilaiIndex);
	}
}
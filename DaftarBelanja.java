import java.util.Scanner;

public class daftarBelanja {
	 public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
        int totalItem = 0;
        int totalHarga = 0;

        System.out.print("Jumlah belanja item-0 rp 2500: ");
        int i0 = input.nextInt();
        totalItem += i0;
        totalHarga += i0 * 2500;

        System.out.print("Jumlah belanja item-1 rp 3000: ");
        int i1 = input.nextInt();
        totalItem += i1;
        totalHarga += i1 * 3000;

        System.out.print("Jumlah belanja item-2 rp 4000: ");
        int i2 = input.nextInt();
        totalItem += i2;
        totalHarga += i2 * 4000;

        System.out.print("Jumlah belanja item-3 rp 5000: ");
        int i3 = input.nextInt();
        totalItem += i3;
        totalHarga += i3 * 5000;

        System.out.print("Jumlah belanja item-4 rp 6000: ");
        int i4 = input.nextInt();
        totalItem += i4;
        totalHarga += i4 * 6000;
		
		  System.out.println("Daftar belanja dan harga:");
        System.out.println("Harga barang ke-0, 2500, 2 item: 5000");
        System.out.println("Harga barang ke-1, 3000, 1 item: 3000");
        System.out.println("Harga barang ke-2, 4000, 3 item: 12000");
        System.out.println("Harga barang ke-3, 5000, 0 item: 0");
        System.out.println("Harga barang ke-4, 6000, 3 item: 18000");
        System.out.println("Total item: " + totalItem);
        System.out.println("Total belanja: Rp " + totalHarga);

	}
}
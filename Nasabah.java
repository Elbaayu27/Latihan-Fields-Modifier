public class Nasabah{
	public static void main(String[] args) {
		Bank nasabahA = new Bank();
		Bank nasabahB = new Bank();

		nasabahB.namaNasabah("Elba Ayu Kurnia");
		nasabahB.addSaldo(100);
		nasabahB.minSaldo(20, "Pembayaran Virtual Akun");
		nasabahB.showInfo();
	}
}
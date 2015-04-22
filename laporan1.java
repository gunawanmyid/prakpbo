package prak1;

public class laporan1 {
	static int a,b,c; //pendeklarasian variabel global
	public static void main(String args[]) {
		biodata(); //pemanggilan method biodata
		System.out.println(jumlah(10, 20)); //pemanggilan method tambah
		System.out.println(kurang(20, 10)); //pemanggilan method kurang
		System.out.println(bagi(30, 4));//pemanggilan method bagi
		kali();//pemanggilan method kali
	}
	
	static void biodata() {  // BERIKAN PENJELASAN maksudnya apa ..=)
		String nama="Dedy"; //pendeklarasian variabel lokal
		String alamat="Perumnas Antang"; //pendeklarasian variabel lokal
		int usia=20; //pendeklarasian variabel lokal
		String tanggal_lahir="19-10-1994";//pendeklarasian variabel lokal
		System.out.println("Nama saya "+nama);
		System.out.println("Tinggal di "+alamat);
		System.out.println("dengan usia ="+usia);
		System.out.println("Karena lahir padaa tanggal "+tanggal_lahir);
	}
	
	static int jumlah(int a, int b) { // BERIKAN PENJELASAN  jumlah(int a, int b) maksudnya apa ..=)
		return a+b;  // BERIKAN PENJELASAN  jumlah(int a, int b) maksudnya apa ..=)
	}
	static int kurang(int a, int b) {
		return a-b;
	}
	static void kali() {
		a=10;  // BERIKAN PENJELASAN maksudnya apa ..=)
		b=4;  // BERIKAN PENJELASAN maksudnya apa ..=)
		c=a*b;  // BERIKAN PENJELASAN maksudnya apa ..=)
		System.out.println("hasil kali dari "+a+" dan "+b+" adalah "+c);
	}
	static float bagi(float a, float b) {  // BERIKAN PENJELASAN maksudnya apa ..=)
		return a/b;   // BERIKAN PENJELASAN maksudnya apa ..=)
	}
}

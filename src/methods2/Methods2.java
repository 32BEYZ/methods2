package methods2;

public class Methods2 {

	public static void main(String[] args) {
		String mesaj = "Bugun hava çok güzel.";
	String yeniMesaj =   	mesaj.substring(0,2);
	System.out.println(yeniMesaj);


	int sayı = topla(5,7);
	System.out.println(sayı);
	 
	int toplam = topla2(...sayilar: 2,3,4,5,6,10);
	System.out.println(toplam);
	

	}
public static void ekle () {
	System.out.println("Eklendi");
	
}
public static void sil () {
	System.out.println("silindi");
	
}
public static void guncelle () {
	System.out.println("güncellendi");
	
}

public static int topla(int sayı,int sayı2) {
	return sayı + sayı2;
}
 
public static int topla2 (int... sayilar) {
	int toplam = 0;
	for (int sayı : sayilar) {
		toplam+=sayı;
	}
	

	return toplam ;



}
}

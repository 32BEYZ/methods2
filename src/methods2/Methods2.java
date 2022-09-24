package methods2;

public class Methods2 {

	public static void main(String[] args) {
		String mesaj = "Bugun hava çok güzel.";
	String yeniMesaj =   	mesaj.substring(0,2);
	System.out.println(yeniMesaj);


	int sayı = topla(5,7);
	System.out.println(sayı);
	

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
}

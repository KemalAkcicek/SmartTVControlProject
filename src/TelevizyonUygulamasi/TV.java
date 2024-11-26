package TelevizyonUygulamasi;

import java.util.Scanner;

public class TV {
	static Scanner scan = new Scanner(System.in);

	static Televizyon tv;

	public static void main(String[] args) {

		menuyuGoster();

		boolean sonuc = false;

		while (!sonuc) {

			int secim = scan.nextInt();
			switch (secim) {

			case 1: {
				televizyonKur();
				break;

			}
			case 2: {
				televizyonAc();
				break;
			}
			case 3: {
				sesArtir();
				break;
			}
			case 4: {
				sesAzaltt();
				break;
			}
			case 5: {
				kanalBilgisi();
				break;
			}
			case 6: {
				kanalDegistir();
				break;
			}
			case 7: {
				System.out.println("Menü tekrardan gösteriliyor....");
				menuyuGoster();

				break;
			}
			case 8: {
				televizyonuKapat();
				break;
			}
			case 9: {
				System.out.println("Sistemden Çıkılıyor....");
				sonuc = true;
				break;

			}
			default: {
				System.out.println("Geçersiz seçim yaptınız lütfen tekrar giriniz: ");
				menuyuGoster();

			}

			}
			System.out.println("1-9 arasinda seçim yapiniz(Menüyü görmek için 7 basiniz...)");

		}

	}

	private static void kanalDegistir() {

		if (tv != null) {
			tv.kanaliDegistir();
		} else {
			System.out.println("Televizyon nesnesi oluşturmadiniz..");
		}
	}

	private static void kanalBilgisi() {
		if (tv != null) {
			tv.kanalBilgileriniGoster();

		} else {
			System.out.println("Televizyon nesnesi oluşturmadiniz...");
		}

	}

	private static void sesArtir() {
		if (tv != null) {
			tv.sesAc();
		} else {
			System.out.println("Televizyon nesnesi oluşturmadiniz...");
		}

	}

	private static void sesAzaltt() {
		if (tv != null) {
			tv.sesKapat();
		} else {
			System.out.println("Televizyon nesnesi oluşturmadiniz...");
		}

	}

	private static void televizyonuKapat() {

		if (tv != null) {
			tv.tvKapat();
		} else {
			System.out.println("Televizyon nesnesi oluşturmadiniz....");
		}
	}

	private static void televizyonAc() {

		if (tv != null) {
			tv.tvAc();
		} else {
			System.out.println("Televizyon nesnesi oluşturmadiniz....");
		}

	}

	private static void televizyonKur() {
		scan.nextLine();

		if (tv == null) {
			System.out.println("Lütfen televizyon markası giriniz");
			String marka = scan.nextLine();
			System.out.println("Televizyon boyutu inc ");
			String boyut = scan.nextLine();
			System.out.println("Televizyon kuruluyor....");
			tv = new Televizyon(marka, boyut);
			System.out.println(tv);

		} else {
			System.out.println("Televizyon zaten oluşturuldu");
			System.out.println(tv);
		}

	}

	private static void menuyuGoster() {
		System.out.println("1:Televizyonu kur\n" + "2:Televizyonu aç \n" + "3:Ses artır \n" + "4:Ses azalt \n"
				+ "5:Kanal bilgisini göster: \n" + "6:Kanal değiştir: \n" + "7:Menuyu Göster \n"
				+ "8:Televizyonu Kapat\n" + "9:Sistemden Çıkmak:");

	}
}

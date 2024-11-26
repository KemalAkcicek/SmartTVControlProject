package TelevizyonUygulamasi;

import java.util.ArrayList;
import java.util.Scanner;

public class Televizyon {

	Scanner scan=new Scanner(System.in);
	
	private String marka;
	private String boyut;
	private ArrayList<Kanal> kanallar;
	private boolean acıkmi;
	private int sesSeviyesi;

	private int aktifKanal;

	public Televizyon(String marka, String boyut) {
		this.marka = marka;
		this.boyut = boyut;
		acıkmi = false;
		kanallar = new ArrayList<Kanal>();
		sesSeviyesi = 10;
		kanallarıOlustur();
		
		aktifKanal=3;
	}

	public void tvAc() {
		if (acıkmi == false) {
			acıkmi = true;
			System.out.println("Televizyon açılıyor");
		} else {
			System.out.println("Televizyon zaten acik");
		}
	}

	public void tvKapat() {
		if (acıkmi == true) {
			acıkmi = false;
			System.out.println("Televizyon kapaniyor");

		} else {
			System.out.println("Televizyon zaten kapalı");
		}
	}

	public void sesAc() {
		if (sesSeviyesi < 20 && acıkmi) {
			sesSeviyesi++;
			System.out.println("Yeni ses seviyeniz: " + sesSeviyesi);
		} else {
			System.out.println("Ses seviyesi maximumda daha fazla artiramazsin,veya televizyon kapali");
		}
	}

	public void sesKapat() {
		if (sesSeviyesi > 0 && acıkmi) {
			sesSeviyesi--;
			System.out.println("Yeni ses seviyeniz: " + sesSeviyesi);

		} else {
			System.out.println("Ses seviyesi minumda daha fazla azaltamasin,veya televizyon kapali");
		}

	}

	private void kanallarıOlustur() {
		HaberKanali ntv = new HaberKanali("NTV", 1, "Genel haberler");
		kanallar.add(ntv);
		HaberKanali trtSpor = new HaberKanali("TRT Spor", 2, "Spor haberleri");
		kanallar.add(trtSpor);
		MuzikKanali slowTurk = new MuzikKanali("Slow Türk", 3, "Yerli");
		kanallar.add(slowTurk);
		MuzikKanali numberOne = new MuzikKanali("Number One", 4, "Yabanci");
		kanallar.add(numberOne);
	}

	public void kanaliDegistir() {
         System.out.println("İstediğiniz kanalın numarisni giriniz...");
         int istenenKanal=scan.nextInt();
		
		if(istenenKanal<=4 &&istenenKanal>0&&acıkmi) {
			aktifKanal=istenenKanal;
			System.out.println(kanallar.get(aktifKanal-1).toString());
		}
		else {
			System.out.println("Aktif bir kanal giriniz,veya televizyonu açınız");
		}
		

	}

	public void kanalBilgileriniGoster() {
		
		if(acıkmi) {
			System.out.println(kanallar.get(aktifKanal-1).toString());

		}
		else {
			System.out.println("Televizyon açık değil...");
		}
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getBoyut() {
		return boyut;
	}

	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}

	@Override
	public String toString() {
		return "Televizyon marka=" + marka + ", boyut=" + boyut + " Televizyon oluşturuldu ";
	}

}

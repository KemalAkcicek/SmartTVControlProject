package TelevizyonUygulamasi;

public class Kanal {

	private String adi;
	private int numarisi;

	public Kanal(String adi, int numarisi) {

		this.adi = adi;
		this.numarisi = numarisi;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public int getNumarisi() {
		return numarisi;
	}

	public void setNumarisi(int numarisi) {
		this.numarisi = numarisi;
	}

	@Override
	public String toString() {
		return "Kanal adi=" + adi + ", numarisi=" + numarisi + "";
	}

	
	

}

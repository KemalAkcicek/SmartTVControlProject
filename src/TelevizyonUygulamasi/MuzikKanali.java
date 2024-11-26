package TelevizyonUygulamasi;

public class MuzikKanali extends Kanal {

	private String muzikTuru;
	
	public MuzikKanali(String adi, int numarisi,String muzikTuru) {
		super(adi, numarisi);
		this.muzikTuru=muzikTuru;
	}

	public String getMuzikTuru() {
		return muzikTuru;
	}

	public void setMuzikTuru(String muzikTuru) {
		this.muzikTuru = muzikTuru;
	}

	

}

package TelevizyonUygulamasi;

public class HaberKanali extends Kanal{

	private String haberTuru;
	
	public HaberKanali(String adi, int numarisi,String tur) {
		super(adi, numarisi);
		this.haberTuru=tur;
	}

	public String getHaberTuru() {
		return haberTuru;
	}

	public void setHaberTuru(String haberTuru) {
		this.haberTuru = haberTuru;
	}

	
	
	

}

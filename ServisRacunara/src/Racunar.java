
public class Racunar {

	private String serijskiBroj;
	private double brzinaProcesora;
	private String markaRacunara;
	
	public Racunar(String serijskiBroj, double brzinaProcesora, String markaRacunara) {
		super();
		this.serijskiBroj = serijskiBroj;
		this.brzinaProcesora = brzinaProcesora;
		this.markaRacunara = markaRacunara;
	}
	
	public String getSerijskiBroj() {
		return serijskiBroj;
	}

	public void setSerijskiBroj(String serijskiBroj) {
		this.serijskiBroj = serijskiBroj;
	}

	public double getBrzinaProcesora() {
		return brzinaProcesora;
	}

	public void setBrzinaProcesora(double brzinaProcesora) {
		this.brzinaProcesora = brzinaProcesora;
	}

	public String getMarkaRacunara() {
		return markaRacunara;
	}

	public void setMarkaRacunara(String markaRacunara) {
		this.markaRacunara = markaRacunara;
	}
	
	
	
	
}


public class Laptop extends Racunar {

	private double velicinaDispleja;

	public Laptop(String serijskiBroj, double brzinaProcesora, String markaRacunara, double velicinaDispleja) {
		super(serijskiBroj, brzinaProcesora, markaRacunara);
		this.velicinaDispleja = velicinaDispleja;
	}

	public double getVelicinaDispleja() {
		return velicinaDispleja;
	}

	public void setVelicinaDispleja(double velicinaDispleja) {
		this.velicinaDispleja = velicinaDispleja;
	}
	
}

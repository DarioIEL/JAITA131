package veicoli;

public abstract class Veicolo {
	protected String marca;
	
	public Veicolo(String marca) {
		this.marca = marca;
	}

	//Posso avere metodi astratti, i quali vanno implementati dalla sottoclasse
	abstract void accelera();
	
	//Posso avere metodi concreti 
	public void accendi() {
		System.out.println("Veicolo Acceso " + this.marca);
	}
	
	
	public void spegni() {
		System.out.println("Veicolo Spento " + this.marca);
	}
	
}

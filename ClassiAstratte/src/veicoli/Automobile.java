package veicoli;

public class Automobile extends Veicolo implements VeicoloElettrico {
	
	boolean isElectric;
	
	public Automobile(String marca) {
		super(marca);
	}

	//OBBLIGATORIO implementare i metodi astratti. accelera()
	@Override
	void accelera() {
		System.out.println("L'automobile sta accelerando");
	}

	//OPZIONALE fare l'override del metodo accendi
	@Override
	public void accendi(){
		System.out.println("Ho acceso l'automobile");
	}

	@Override
	public void ricarica() {
		System.out.println("Ricarica completata !");
	}

	@Override
	public void sostituisciBatteria() {
		System.out.println("Batteria Sostituita");
		
	}
	
	
}

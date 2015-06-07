public class Pokoj extends Lokalizacja {
	int nbr;

	public Pokoj(int nbr) {
		this.nbr=nbr;
	}
	
	@Override
	void opis() {
		System.out.println("Pokoj nr" + nbr);
		// TODO Auto-generated method stub
		// sortowanie - Collections.sort

	}

}
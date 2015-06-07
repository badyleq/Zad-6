import java.util.ArrayList;

public class Budynek extends Lokalizacja implements Comparable<Budynek> {

	String nazwa;

	Budynek(String nazwa) {
		this.nazwa = nazwa;

	}

	ArrayList<Pietro> pietra = new ArrayList<Pietro>();

	void dodajPietro(Pietro piet) {
		pietra.add(piet);
	}

	void dodajPietro() {
		pietra.add(new Pietro());
	}

	void dodajPietro(int nbr, Pietro piet) {
		pietra.add(nbr, piet);
	}

	public Pietro wybierzPietro(int nbr) {
		return pietra.get(nbr);
	}

	@Override
	public int compareTo(Budynek b) {
		int bud1;
		int bud2;
		bud1 = bud2 = 0;
		for (int i = 0; i < this.pietra.size(); i++) {
				
				bud1 += this.wybierzPietro(i).pokoje.size();
		}
		
		for (int i = 0; i < b.pietra.size(); i++) {
			bud2 += b.wybierzPietro(i).pokoje.size();
		}
		if (bud1 > bud2) {
			return 1;
		} else {
			if (bud1 == bud2) {
				return 0;
			} else return -1;
		}
		// TODO Auto-generated method stub
	}

	@Override
	void opis() {
		System.out.println("To jest " + nazwa);
		for (int i = 0; i < pietra.size(); i++) {
			pietra.get(i).opis();
		}
		System.out.println();
		// TODO Auto-generated method stub

	}

}
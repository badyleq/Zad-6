import java.util.ArrayList;

public class Pietro extends Lokalizacja {


	ArrayList<Pokoj> pokoje = new ArrayList<Pokoj>();

	void dodajPokoj(int nbr) {
		pokoje.add(new Pokoj(nbr));
	}

	@Override
	void opis() {
		System.out.println("Pietro.Liczba pokoi: "+pokoje.size());
		for (int i = 0; i < pokoje.size(); i++) {
			pokoje.get(i).opis();
		}
		// TODO Auto-generated method stub

	}

}
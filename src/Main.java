import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("asdasdas");
		try {
			Budynek bud1 = new Budynek("Szkola");
			bud1.dodajPietro();
			bud1.dodajPietro();
			bud1.wybierzPietro(0).dodajPokoj(27);
			bud1.wybierzPietro(1).dodajPokoj(2);
			bud1.wybierzPietro(1).dodajPokoj(45);
			bud1.wybierzPietro(1).dodajPokoj(21);
			bud1.opis();

			Budynek bud2 = new Budynek("Silownia");
			bud2.dodajPietro();
			bud2.dodajPietro();
			bud2.wybierzPietro(1).dodajPokoj(2);
			bud2.wybierzPietro(1).dodajPokoj(45);
			bud2.wybierzPietro(1).dodajPokoj(21);
			bud2.opis();

			Budynek bud3 = new Budynek("Kosciol");
			bud3.dodajPietro();
			bud3.dodajPietro();
			bud3.wybierzPietro(0).dodajPokoj(72);
			bud3.wybierzPietro(0).dodajPokoj(211);
			bud3.wybierzPietro(1).dodajPokoj(2);
			bud3.wybierzPietro(1).dodajPokoj(54);
			bud3.wybierzPietro(1).dodajPokoj(21);
			bud3.wybierzPietro(1).dodajPokoj(22);
			bud3.opis();

			
			compare(bud1,bud2);
			compare(bud1,bud3);
			compare(bud2,bud3);
			
			
			ArrayList<Budynek> bud = new ArrayList<Budynek>();

			bud.add(bud1);
			bud.add(bud2);
			bud.add(bud3);
			
			Collections.sort(bud);

			System.out.println("Lista posortowanych budynkow\n");
			for (int i = 0; i < bud.size(); i++)
				System.out.println((i+1)+") "+bud.get(i).nazwa);

		} catch (IndexOutOfBoundsException ioob) {
			System.out.println("Index out of bounds");
		}

	}

	public static void compare(Budynek b1, Budynek b2) {
		System.out.println("Porównujemy "+b1.nazwa+" oraz "+b2.nazwa+".");
		if (b1.compareTo(b2) == 1)
			System.out.println(b1.nazwa+" jest wiekszy/a\n");
		else if (b1.compareTo(b2) == -1)
			System.out.println(b2.nazwa+" jest wiekszy/a\n");
		else if (b1.compareTo(b2) == 0)
			System.out.println("Budynki sa rowne\n");
	}
}

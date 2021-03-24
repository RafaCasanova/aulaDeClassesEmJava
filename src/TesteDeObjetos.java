import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteDeObjetos {
	
	public static void main(String[] args) {
	Aula a1 = new Aula("List", 20 );
	Aula a2 = new Aula("Objetos", 15);
	Aula a3 = new Aula("Set",10);
	
	ArrayList<Aula> aulas = new ArrayList<>();
	
	aulas.add(a1);
	aulas.add(a2);
	aulas.add(a3);
	
	System.out.println(aulas);
	
	
	Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
	
	System.out.println(aulas);
	
	aulas.sort(Comparator.comparing(Aula::getTempo));
	
	
	}
}

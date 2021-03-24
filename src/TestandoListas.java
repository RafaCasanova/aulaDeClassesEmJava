import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		
		ArrayList<String> conteudos = new ArrayList<>();
		
		var aula1 = "Spring";
		var aula2 = "MongoDB";
		var aula3 = "Java EE";
		var aula4 = "Kotlin";
		
		conteudos.add(aula1);
		conteudos.add(aula2);
		conteudos.add(aula3);
		conteudos.add(aula4);
		System.out.println(conteudos);
		
		for(int i = 0; i < conteudos.size(); i++ ) {
			System.out.print(conteudos.get(i) + " ");
			}
		
		conteudos.remove(2);
		
		System.out.println(conteudos);
		
		for(String materia : conteudos) {
			System.out.print(materia + " ");
		}
		
		
		conteudos.forEach(elemento -> System.out.print(elemento + " "));
		
		Collections.sort(conteudos);
		Collections.reverse(conteudos);
		System.out.println(conteudos);
		
		
	}
}

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TesteDeCursos {
	
	public static void main(String[] args) {
		
	Curso javaColecoes = new Curso("Coleções java", "Paulo");
	
	List<Aula> aulas = javaColecoes.getAulas();//lista imutavel
	
	javaColecoes.adiciona(new Aula("Array",12));
	javaColecoes.adiciona(new Aula("List",26));
	javaColecoes.adiciona(new Aula("Set",10));
	javaColecoes.adiciona(new Aula("Map",15));
	
	
	List<Aula> aulasDoCurso = new LinkedList<>(aulas);
	Collections.sort(aulasDoCurso);
	
	Aluno a1 = new Aluno("Rafael Matos", 0001);
	Aluno a2 = new Aluno("Paulo Silveira", 0002);
	Aluno a3 = new Aluno("Nico Steppa", 0003);
	
	javaColecoes.matricular(a1);
	javaColecoes.matricular(a2);
	javaColecoes.matricular(a3);
	
	javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));
	
	System.out.println(javaColecoes.estaMatriculado(a3));
	
	
	/*
	 * Set<Aluno> alunos = javaColecoes.getAlunos(); Iterator<Aluno> iterador =
	 * alunos.iterator(); while(iterador.hasNext()) {
	 * System.out.println(iterador.next()); } // codigo legado, use foreach
	 */
	
	System.out.println(javaColecoes.buscaMatricula(4));//null caso nao exista o numero
	
	
	}
}

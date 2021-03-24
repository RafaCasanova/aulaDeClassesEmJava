import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaAluno = new HashMap<>();
	
	
	public Curso(String nome,String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public List<Aula> getAulas(){
		return Collections.unmodifiableList(aulas);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		int tempototal =  0;
		for(Aula aula : aulas) {
			tempototal += aula.getTempo();
		} return tempototal;
	}
	
	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaAluno.put(aluno.getMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(alunos);
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	public Aluno buscaMatricula(int numero) {
		return matriculaAluno.get(numero);
	}
	
@Override
public String toString() {
	return "Curso: " + nome +", Tempo total: " + this.getTempoTotal();
}

}


public class Aluno {

	private String nome;
	private int matricula;
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	@Override
	public boolean equals(Object obj) {
		Aluno um = (Aluno)obj;
		return this.nome.equals(um.nome);
	}
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	@Override
	public String toString() {
		
		return "[Aluno: " + this.getNome() +", Matricula: "  + this.getMatricula() + "]";
	}
	
	
}

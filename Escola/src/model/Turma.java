package model;

public class Turma {
	private String nome;
	private String curso;
	private int qtdAlunos;
	private int serie;
	
	public Turma () {
	
	}
	
	public Turma (String nome, String curso, int qtdAlunos, int serie) {
		this.nome = nome;
		this.curso = curso;
		this.qtdAlunos = qtdAlunos;
		this.serie = serie;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCurso(String curso) {
		this.curso=curso;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos=qtdAlunos;
	}
	
	public int getQtdAlunos() {
		return qtdAlunos;
	}
	
	public void setSerie(int serie) {
		this.serie=serie;
	}
	
	public int getserie() {
		return serie;
	}

	@Override
	public String toString() {
		return "O nome da turma é: " + nome + ", seu curso é " + curso + ", a qauntidade de alunos é " + qtdAlunos + ", sua série é " + serie + "º";
	}
}

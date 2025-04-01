package view;
import model.Alunos;

public class TesteAluno {

	public static void main(String[] args) {		
	Alunos alunos = new Alunos();	
	
	alunos.setNome("João");
	
	alunos.setIdade(18);	
	alunos.setPeso(80.5);
	alunos.setSexo('M');
	alunos.setFormando(true);
	
	
	System.out.println("O seu nome é: "+alunos.getNome());
	System.out.println(alunos.toString());
	}

}

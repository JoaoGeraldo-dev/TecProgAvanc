package view;

import model.Disciplina;

public class TesteDisciplina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Disciplina  disciplina = new Disciplina();
		
		disciplina.setNome("Matematica");
		disciplina.setProfessor("Menoti");
		disciplina.setSemestre(2);
		disciplina.setOfertada(false);
		
		System.out.println(disciplina.toString());
		
		
		
		
		
	}

}

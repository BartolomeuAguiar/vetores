package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];

	public void adiciona(Aluno aluno) {
		for (int i = 0; i < this.alunos.length; i++) {
			if (this.alunos[i] == null) {
				this.alunos[i] = aluno;
				break;
			}
		}
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		//implementa��o
	}
	
	public Aluno pega(int posicao) {
		//implementa��o
		return null;
	}
	
	public void remove(int posicao) {
		//implementa��o
	}
	
	public boolean contem(Aluno aluno) {
		//implementa��o
		return false;
	}
	
	public int tamanho() {
		//implementa��o
		return 0;
	}

}

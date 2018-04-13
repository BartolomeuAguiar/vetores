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
		//implementação
	}
	
	public Aluno pega(int posicao) {
		//implementação
		return null;
	}
	
	public void remove(int posicao) {
		//implementação
	}
	
	public boolean contem(Aluno aluno) {
		//implementação
		return false;
	}
	
	public int tamanho() {
		//implementação
		return 0;
	}

}

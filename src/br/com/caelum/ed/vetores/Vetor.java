package br.com.caelum.ed.vetores;

import java.util.Arrays;

import br.com.caelum.ed.Aluno;

public class Vetor {

	//inicializa��o de um array de alunos com 100 posi��es
	private Aluno[] alunos = new Aluno[100];
	
	private int totalDeAlunos = 0;

	public void adiciona(Aluno aluno) {
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		//implementa��o TesteAdicionaPorposi��o
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
	
	@Override
	public String toString() {
		if (this.totalDeAlunos==0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for (int i = 0; i<this.totalDeAlunos - 1; i++) {
			builder.append(this.alunos[i]);
			builder.append(", ");
		}
		
		builder.append(this.alunos[this.totalDeAlunos-1]);
		builder.append("]");
		
		
		return builder.toString();
	}

}

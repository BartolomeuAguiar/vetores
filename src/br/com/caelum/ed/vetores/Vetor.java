package br.com.caelum.ed.vetores;

import java.util.Arrays;

import br.com.caelum.ed.Aluno;

public class Vetor {

	//inicialização de um array de alunos com 100 posições
	private Aluno[] alunos = new Aluno[100];
	
	private int totalDeAlunos = 0;

	public void adiciona(Aluno aluno) {
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		//implementação TesteAdicionaPorposição
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

package models;

import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author Fagundes, Emiliano
 * @since 05-2018
 *
 */

public class Projeto {
	public class Tarefa {
		String nome;
		int custo;
		List<Relacao> adj;

		Tarefa(String nome, int custo) {
			this.nome = nome;
			this.adj = new ArrayList<Relacao>();
			this.custo = custo;
		}

		void addAdj(Relacao e) {
			adj.add(e);
		}
	}

	public class Relacao {
		Tarefa origem;
		Tarefa destino;

		Relacao(Tarefa origem, Tarefa destino) {
			this.origem = origem;
			this.destino = destino;
		}
	}
	private 	String nomeProjeto;
	private 	List<Tarefa> tarefas;
	private List<Relacao> relacoes;

	public Projeto() {
		tarefas = new ArrayList<Tarefa>();
		relacoes = new ArrayList<Relacao>();
	}
	
	
	public void addNewTarefa(String nome,  int custo) {
			this.tarefas.add(new Tarefa(nome, custo));
	}
		
	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto= nomeProjeto;;
	}
	public String getNomeProjeto() {
		return this.nomeProjeto;;
	}
	
	public List<Tarefa> getTarefas() {
		return tarefas;
	}
	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	public List<Relacao> getRelacoes() {
		return relacoes;
	}
	public void setRelacoes(List<Relacao> relacoes) {
		this.relacoes = relacoes;
	}
	public String toString() {
		String r = "";
		for (Tarefa u : tarefas) {
			r += u.nome + " -> ";
			for (Relacao e : u.adj) {
				Tarefa v = e.destino;
				r += v.nome + ", ";
			}
			r += "\n";
		}
		return r;
	}
}

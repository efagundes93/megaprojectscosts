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
		List<Relacao> adj;

		Tarefa(String nome) {
			this.nome = nome;
			this.adj = new ArrayList<Relacao>();
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

	List<Tarefa> tarefas;
	List<Relacao> relacoes;

	public Projeto() {
		tarefas = new ArrayList<Tarefa>();
		relacoes = new ArrayList<Relacao>();
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

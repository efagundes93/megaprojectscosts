package controllers;

import models.Projeto;

/**
 * 
 * @author Fagundes, Emiliano
 * @since		05-2018
 *
 */
public class ProjetoController {
	public void test() {
		Projeto projeto = new Projeto();
		projeto.setNomeProjeto("Projeto teste");
		projeto.addNewTarefa("Tarefa001", 50);
	}
}
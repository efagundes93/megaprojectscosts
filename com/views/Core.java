package views;

import builders.ProjetoBuilder;
import dao.ProjetoDAO;
import models.Projeto;

/**
 * 
 * @author Fagundes, Emiliano
 * @since		05-2018
 *
 */
public class Core {

	public static void main(String[] args) {
        ProjetoBuilder builder = new ProjetoBuilder();
        builder.getInstance();

	}
}

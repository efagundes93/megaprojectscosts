package builders;

import dao.ProjetoDAO;
import models.Projeto;

import java.util.List;

public class ProjetoBuilder {

    private Projeto projeto;
    private ProjetoDAO dao;


    public ProjetoBuilder(Projeto projeto, ProjetoDAO dao) {

        this.projeto = projeto;
        this.dao = dao;
    }


    public ProjetoBuilder() {

        this.projeto = new Projeto();
        this.dao = new ProjetoDAO();
    }
    public Projeto getInstance(){

        return null;
    }
}

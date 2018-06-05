package dao;

import javafx.beans.binding.IntegerBinding;
import models.Projeto;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Fagundes, Emiliano
 * @since		05-2018
 *
 */
public  class ProjetoDAO {

   private  List<String> linhasArquivo;

   public ProjetoDAO(){
       linhasArquivo = new ArrayList<>();
       readFile();
   }

   public  void readFile(){

        Path path = Paths.get("C:\\Repositorios\\megaprojectscosts\\casos-de-teste\\caso0100.txt");

        try {
            this.linhasArquivo = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int readQuantidadeAtividades(){

       int k = Integer.parseInt(linhasArquivo.get(0));
       return k;

    }

    public Map<String, Integer> getAtividades(){

       Map<String, Integer> atividades = new HashMap<String, Integer>();

       if(null != this.linhasArquivo && 1 < this.linhasArquivo.size()){
           for(int i = 1; i <= readQuantidadeAtividades() ; i ++){
                String [] splitted = this.linhasArquivo.get(i).split(" ");
                String activityName = splitted[0];
                int activityCost = Integer.parseInt(splitted[1]);
                atividades.put(activityName, activityCost);
           }
       }
       return  atividades;
    }

    public int getQuantidadeLinks(){

       return Integer.parseInt(this.linhasArquivo.get(readQuantidadeAtividades() + 1));
    }

    public Map<String[], Integer> getLinkAtividades(){

       Map<String[], Integer> links = new HashMap<>();
       for(int i = readQuantidadeAtividades() ; i < getQuantidadeLinks()+1 ; i++){
           String [] relacao = new String[2];
           String [] splitted = this.linhasArquivo.get(i).split(" ");
           relacao[0] =  splitted[0];
           relacao[1] =  splitted[1];
           links.put( relacao,  Integer.parseInt(splitted[2]));
       }

       return links;
    }
}

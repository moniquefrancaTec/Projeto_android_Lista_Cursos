package dev.android.monique.franca.app.lista.app_lista_curso.controller;

import java.util.ArrayList;
import java.util.List;

import dev.android.monique.franca.app.lista.app_lista_curso.model.Curso;

public class CursoController {

    private   List listaCurso;

    public List getListaCursos(){
        listaCurso = new ArrayList<Curso>();

        listaCurso.add(new Curso("Tecnico em Sistema"));
        listaCurso.add(new Curso("Estética"));
        listaCurso.add(new Curso("Segurança do Trabalho"));
        listaCurso.add(new Curso("Administração"));
        listaCurso.add(new Curso("logística"));
        listaCurso.add(new Curso("Recuros Humanos"));
        listaCurso.add(new Curso("Informática"));
        listaCurso.add(new Curso("Edificações"));

        return listaCurso;
    }

    public ArrayList<String> dadosSpinner(){
        ArrayList<String> dados =  new ArrayList<>();

        for (int i = 0; i < getListaCursos().size() ; i++) {

            Curso objeto = (Curso) getListaCursos().get(i);
            dados.add(objeto.getCursoDesejado());

        }
        return  dados;
    }


}


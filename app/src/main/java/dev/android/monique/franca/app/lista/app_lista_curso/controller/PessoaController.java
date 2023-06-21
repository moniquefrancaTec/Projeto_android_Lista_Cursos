package dev.android.monique.franca.app.lista.app_lista_curso.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import dev.android.monique.franca.app.lista.app_lista_curso.view.MainActivity;
import dev.android.monique.franca.app.lista.app_lista_curso.model.Pessoas_Curso;

public class PessoaController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;

    public  static  final  String NOME_PREFERENCES ="pref_listavip";

    public PessoaController(MainActivity mainActivity){

        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES,0);
        listaVip = preferences.edit();

    }

    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_Controller", "Controller iniciada....");
        return super.toString();
    }


    public void salvar(Pessoas_Curso outraPessoa) {
        Log.d("MVC_Controller", "Salvo: "+outraPessoa.toString());
        listaVip.putString("primeiroNome", outraPessoa.getNomeAluno());
        listaVip.putString("sobrenome",outraPessoa.getSobrenomeAluno());
        listaVip.putString("nomeCurso", outraPessoa.getNomeCursoDesejado());
        listaVip.putString("telefone", outraPessoa.getTelefoneContato());
        listaVip.apply();

    }

    public Pessoas_Curso buscar(Pessoas_Curso outraPessoa){
        outraPessoa.setNomeAluno(preferences.getString("primeiroNome",""));
        outraPessoa.setSobrenomeAluno(preferences.getString("sobrenome",""));
        outraPessoa.setNomeCursoDesejado(preferences.getString("nomeCurso",""));
        outraPessoa.setTelefoneContato(preferences.getString("telefone",""));
        return  outraPessoa;
    }

    public  void limpar(Pessoas_Curso pessoa){
        listaVip.clear();
        listaVip.apply();
    }








}

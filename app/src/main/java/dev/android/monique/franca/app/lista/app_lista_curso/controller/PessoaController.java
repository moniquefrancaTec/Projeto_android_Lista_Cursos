package dev.android.monique.franca.app.lista.app_lista_curso.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import dev.android.monique.franca.app.lista.app_lista_curso.model.Pessoas_Curso;

public class PessoaController {
    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_Controller", "Controller iniciada....");
        return super.toString();
    }


    public void salvar(Pessoas_Curso outraPessoa) {
        Log.d("MVC_Controller", "Salvo: "+outraPessoa.toString());
    }
}

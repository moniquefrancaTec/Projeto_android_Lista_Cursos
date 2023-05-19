package dev.android.monique.franca.app.lista.app_lista_curso;

import static dev.android.monique.franca.app.lista.app_lista_curso.R.layout.activity_main;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import dev.android.monique.franca.app.lista.app_lista_curso.model.Pessoas_Curso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Pessoas_Curso pessoas = new Pessoas_Curso();
        pessoas.setNomeAluno("Monique");
        pessoas.setSobrenomeAluno("Franca");
        pessoas.setNomeCursoDesejado("Fisica");
        pessoas.setTelefoneContato("389999999");



    }

}

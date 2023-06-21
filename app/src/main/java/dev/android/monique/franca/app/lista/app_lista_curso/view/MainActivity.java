package dev.android.monique.franca.app.lista.app_lista_curso.view;

import static dev.android.monique.franca.app.lista.app_lista_curso.R.layout.activity_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import dev.android.monique.franca.app.lista.app_lista_curso.R;
import dev.android.monique.franca.app.lista.app_lista_curso.controller.CursoController;
import dev.android.monique.franca.app.lista.app_lista_curso.controller.PessoaController;
import dev.android.monique.franca.app.lista.app_lista_curso.model.Pessoas_Curso;

public class MainActivity extends AppCompatActivity {

   /* SharedPreferences preferences;
    SharedPreferences.Editor listavip;

    public static final String NOME_REFERENCES = "pref_listavip";*/

    PessoaController controller;

    Pessoas_Curso pessoa;
    Pessoas_Curso outraPessoa;
    List<String> nomeDoCurso;

    CursoController cursoController;


    EditText editNome;
    EditText editSobrenome;
    EditText editNomedoCurso;
    EditText editTelefone;
    Spinner spinner;

    Button btnbuton_limpar;
    Button btnbuton_salvar;
    Button btnbuton_finalizar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_spinner);

       /* preferences = getSharedPreferences(NOME_REFERENCES,0);
        listavip = preferences.edit();*/

       controller = new PessoaController(MainActivity.this);
       controller.toString();

       /* pessoa = new Pessoas_Curso();
        pessoa.setNomeAluno("Monique");
        pessoa.setSobrenomeAluno("Franca");
        pessoa.setNomeCursoDesejado("Fisica");
        pessoa.setTelefoneContato("389999999");*/

        cursoController = new CursoController();
        /*nomeCurso = findViewById(R.id.txtListaSpinner);*/

        nomeDoCurso = cursoController.dadosSpinner();

        outraPessoa = new Pessoas_Curso();
        controller.buscar(outraPessoa);
        /*outraPessoa.setNomeAluno(preferences.getString("primeiroNome",""));
        outraPessoa.setSobrenomeAluno(preferences.getString("sobrenome",""));
        outraPessoa.setNomeCursoDesejado(preferences.getString("nomeCurso",""));
        outraPessoa.setTelefoneContato(preferences.getString("telefoneContato",""));*/


        editNome = findViewById(R.id.text_Primeiro_nome);
        editSobrenome = findViewById(R.id.text_sobrenome);
        /*editNomedoCurso = findViewById(R.id.text_curso_desejado);*/
        editTelefone = findViewById(R.id.text_telefone_contato);
        spinner =findViewById(R.id.txtListaSpinner);

        btnbuton_limpar = findViewById(R.id.button_limpar);
        btnbuton_salvar = findViewById(R.id.button_salvar);
        btnbuton_finalizar = findViewById(R.id.button_finalizar);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,cursoController.dadosSpinner());

        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner.setAdapter(adapter);

       /* editNome.setText(pessoa.getNomeAluno());
        editSobrenome.setText(pessoa.getSobrenomeAluno());
        editNomedoCurso.setText(pessoa.getNomeCursoDesejado());
        editTelefone.setText(pessoa.getTelefoneContato());*/

        editNome.setText(outraPessoa.getNomeAluno());
        editSobrenome.setText(outraPessoa.getSobrenomeAluno());
        /*editNomedoCurso.setText(outraPessoa.getNomeCursoDesejado());*/
        editTelefone.setText(outraPessoa.getTelefoneContato());

        btnbuton_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNome.setText("");
                editSobrenome.setText("");
                editTelefone.setText("");

                /*listavip.clear();
                listavip.apply();*/
            }
        });

        btnbuton_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                outraPessoa.setNomeAluno(editNome.getText().toString());
                outraPessoa.setSobrenomeAluno(editSobrenome.getText().toString());
                /*outraPessoa.setNomeCursoDesejado(editNomedoCurso.getText().toString());*/
                outraPessoa.setTelefoneContato(editTelefone.getText().toString());

                Toast.makeText(MainActivity.this, "Dados salvos com sucesso " + outraPessoa.toString(), Toast.LENGTH_LONG).show();
                /*listavip.putString("primeiroNome", outraPessoa.getNomeAluno());
                listavip.putString("sobrenome", outraPessoa.getSobrenomeAluno());
                listavip.putString("nomeCurso",outraPessoa.getNomeCursoDesejado());
                listavip.putString("telefoneContato", outraPessoa.getTelefoneContato());
                listavip.apply();*/
                controller.salvar(outraPessoa);
            }
        });

        btnbuton_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Volte sempre pessoa", Toast.LENGTH_LONG).show();
                finish();
            }
        });
        Log.i("proframacaoPOO",outraPessoa.toString());

    }

}

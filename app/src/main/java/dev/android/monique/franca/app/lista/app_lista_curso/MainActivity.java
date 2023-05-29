package dev.android.monique.franca.app.lista.app_lista_curso;

import static dev.android.monique.franca.app.lista.app_lista_curso.R.layout.activity_main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import dev.android.monique.franca.app.lista.app_lista_curso.controller.PessoaController;
import dev.android.monique.franca.app.lista.app_lista_curso.model.Pessoas_Curso;

public class MainActivity extends AppCompatActivity {

    PessoaController controller;

    Pessoas_Curso pessoa;
    Pessoas_Curso outraPessoa;


    EditText editNome;
    EditText editSobrenome;
    EditText editNomedoCurso;
    EditText editTelefone;

    Button btnbuton_limpar;
    Button btnbuton_salvar;
    Button btnbuton_finalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       controller = new PessoaController();
       controller.toString();

        pessoa = new Pessoas_Curso();
        pessoa.setNomeAluno("Monique");
        pessoa.setSobrenomeAluno("Franca");
        pessoa.setNomeCursoDesejado("Fisica");
        pessoa.setTelefoneContato("389999999");

        outraPessoa = new Pessoas_Curso();


        editNome = findViewById(R.id.text_Primeiro_nome);
        editSobrenome = findViewById(R.id.text_sobrenome);
        editNomedoCurso = findViewById(R.id.text_curso_desejado);
        editTelefone = findViewById(R.id.text_telefone_contato);

        btnbuton_limpar = findViewById(R.id.button_limpar);
        btnbuton_salvar = findViewById(R.id.button_salvar);
        btnbuton_finalizar = findViewById(R.id.button_finalizar);

        editNome.setText(pessoa.getNomeAluno());
        editSobrenome.setText(pessoa.getSobrenomeAluno());
        editNomedoCurso.setText(pessoa.getNomeCursoDesejado());
        editTelefone.setText(pessoa.getTelefoneContato());

        btnbuton_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNome.setText("");
                editSobrenome.setText("");
                editNomedoCurso.setText("");
                editTelefone.setText("");
            }
        });

        btnbuton_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                outraPessoa.setNomeAluno(editNome.getText().toString());
                outraPessoa.setSobrenomeAluno(editSobrenome.getText().toString());
                outraPessoa.setNomeCursoDesejado(editNomedoCurso.getText().toString());
                outraPessoa.setTelefoneContato(editTelefone.getText().toString());

                Toast.makeText(MainActivity.this, "Dados salvos com sucesso " + outraPessoa.toString(), Toast.LENGTH_LONG).show();
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


    }

}

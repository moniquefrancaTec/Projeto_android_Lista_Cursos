package dev.android.monique.franca.app.lista.app_lista_curso.model;

public class Pessoas_Curso {
    private String nomeAluno;
    private String sobrenomeAluno;
    private String nomeCursoDesejado;
    private String telefoneContato;

    public Pessoas_Curso() {
    }

    public Pessoas_Curso(String nomeAluno, String sobrenomeAluno, String nomeCursoDesejado, String telefoneContato) {
        this.nomeAluno = nomeAluno;
        this.sobrenomeAluno = sobrenomeAluno;
        this.nomeCursoDesejado = nomeCursoDesejado;
        this.telefoneContato = telefoneContato;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getSobrenomeAluno() {
        return sobrenomeAluno;
    }

    public void setSobrenomeAluno(String sobrenomeAluno) {
        this.sobrenomeAluno = sobrenomeAluno;
    }

    public String getNomeCursoDesejado() {
        return nomeCursoDesejado;
    }

    public void setNomeCursoDesejado(String nomeCursoDesejado) {
        this.nomeCursoDesejado = nomeCursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    @Override
    public String toString() {
        return "Pessoas_Curso{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", sobrenomeAluno='" + sobrenomeAluno + '\'' +
                ", nomeCursoDesejado='" + nomeCursoDesejado + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                '}';
    }
}





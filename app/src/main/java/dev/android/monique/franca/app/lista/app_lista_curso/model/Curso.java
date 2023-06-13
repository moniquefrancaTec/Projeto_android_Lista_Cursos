package dev.android.monique.franca.app.lista.app_lista_curso.model;

public class Curso {
    private  String cursoDesejado;

    public Curso() {
    }

    public Curso(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }
}

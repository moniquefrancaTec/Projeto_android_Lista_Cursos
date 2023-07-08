package dev.android.monique.franca.app.lista.app_lista_curso.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class CursosDataBase extends SQLiteOpenHelper {
    private static  final String DB_NAME = "cursoDataBase.db";
    private static final int DB_VERSION =1;

    Cursor cursor;
    SQLiteDatabase db;

    public CursosDataBase(Context context) {
        super(context, DB_NAME, null,DB_VERSION);
        db=getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlTabelaCurso = "CREATE TABLE Curso (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nomeAluno TEXT," +
                "sobrenomeAluno TEXT, " +
                "telefone TEXT," +
                "curso)";

        db.execSQL(sqlTabelaCurso);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void salvarDados(String tabela, ContentValues dados){
        db.insert("Curso",null, dados);
    }
}

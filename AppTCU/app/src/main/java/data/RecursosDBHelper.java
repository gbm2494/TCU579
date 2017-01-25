package data;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Gaudy-PC on 24/01/2017.
 */

public class RecursosDBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Recursos.db";

    public RecursosDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + RecursosContract.RecursosEntry.TABLE_NAME + " (" +
                RecursosContract.RecursosEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                RecursosContract.RecursosEntry.NOMBRE + " TEXT NOT NULL," +
                RecursosContract.RecursosEntry.AUDIO + " TEXT NOT NULL," +
                RecursosContract.RecursosEntry.IMAGEN + " TEXT NOT NULL," +
                RecursosContract.RecursosEntry.NIVEL + " INTEGER NOT NULL," +
                RecursosContract.RecursosEntry.ITEM_ACTUAL + " INTEGER NOT NULL," +
                        "UNIQUE (" + RecursosContract.RecursosEntry.ID + "))");

        // Contenedor de valores
        ContentValues values = new ContentValues();

        // Pares clave-valor
        values.put(RecursosContract.RecursosEntry.ID, "001");
        values.put(RecursosContract.RecursosEntry.NOMBRE, "a");
        values.put(RecursosContract.RecursosEntry.AUDIO, "a_hombre.mp3");
        values.put(RecursosContract.RecursosEntry.IMAGEN, "a.jpg");
        values.put(RecursosContract.RecursosEntry.NIVEL, "1");
        values.put(RecursosContract.RecursosEntry.ITEM_ACTUAL, 1);

        sqLiteDatabase.insert(RecursosContract.RecursosEntry.TABLE_NAME, null, values);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // No hay operaciones
    }

    public long guardarRecurso(Recursos recurso) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();

        return sqLiteDatabase.insert(
                RecursosContract.RecursosEntry.TABLE_NAME,
                null, recurso.toContentValues());

    }

    public Cursor getAllLawyers() {
        return getReadableDatabase()
                .query(
                        RecursosContract.RecursosEntry.TABLE_NAME,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null);
    }

    public Cursor getLawyerById(String lawyerId) {
        Cursor c = getReadableDatabase().query(
                RecursosContract.RecursosEntry.TABLE_NAME,
                null,
                RecursosContract.RecursosEntry.ID + " LIKE ?",
                new String[]{lawyerId},
                null,
                null,
                null);
        return c;
    }

}

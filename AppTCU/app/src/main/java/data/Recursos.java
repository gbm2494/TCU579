package data;

import java.util.UUID;
import android.content.ContentValues;

/**
 * Entidad "recurso"
 */
public class Recursos {
    private String id;
    private String nombre;
    private String audio;
    private String imagen;
    private int nivel;
    private int itemActual;

    public Recursos(String name, String audio, String image, int level, int currentlyItem) {
        this.id = UUID.randomUUID().toString();
        this.nombre = name;
        this.audio = audio;
        this.imagen = image;
        this.nivel = level;
        this.itemActual = currentlyItem;

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setItemActual(int itemActual) {
        this.itemActual = itemActual;
    }

    public ContentValues toContentValues() {
        ContentValues values = new ContentValues();
        values.put(RecursosContract.RecursosEntry.ID, id);
        values.put(RecursosContract.RecursosEntry.NOMBRE, nombre);
        values.put(RecursosContract.RecursosEntry.AUDIO, audio);
        values.put(RecursosContract.RecursosEntry.IMAGEN, imagen);
        values.put(RecursosContract.RecursosEntry.NIVEL, nivel);
        values.put(RecursosContract.RecursosEntry.ITEM_ACTUAL, itemActual);
        return values;
    }
}
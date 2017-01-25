package data;

import android.provider.BaseColumns;

/**
 * Esquema de la base de datos para abogados
 */
public class RecursosContract {

    public static abstract class RecursosEntry implements BaseColumns {
        public static final String TABLE_NAME ="recursos";

        public static final String ID = "id";
        public static final String NOMBRE = "nombre";
        public static final String AUDIO = "audio";
        public static final String IMAGEN = "imagen";
        public static final String NIVEL = "nivel";
        public static final String ITEM_ACTUAL = "item_actual";
    }
}
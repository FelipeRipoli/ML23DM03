package br.edu.mouralacerda.ml23dm03

import android.content.Context
import androidx.room.RoomDatabase

abstract class Database: RoomDatabase() {
    companion object{
        private var database: Database? = null
        private var DATABASE = "BDNOMES"

        fun getInstance(context: Context): Database?{
            if (database == null) {
                return criaBanco(context)
            } else {
                return database
            }
        }

    }
}
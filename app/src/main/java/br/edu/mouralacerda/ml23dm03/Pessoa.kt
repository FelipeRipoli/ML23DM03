package br.edu.mouralacerda.ml23dm03

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Pessoa(
    val nome: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
) {}

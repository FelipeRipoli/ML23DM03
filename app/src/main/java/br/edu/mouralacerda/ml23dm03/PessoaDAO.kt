package br.edu.mouralacerda.ml23dm03

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PessoaDAO {
    @Insert
    fun salvar(obj: Pessoa)

    @Query("SELECT * FROM Pessoa")
    fun listar(): List<Pessoa>
}
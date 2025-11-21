package com.example.inventoryapp.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ProductoDao {
    @Insert suspend fun insertar(producto: Producto)
    @Update suspend fun actualizar(producto: Producto)
    @Delete suspend fun eliminar(producto: Producto)
    @Query("SELECT * FROM productos") fun obtenerTodos(): LiveData<List<Producto>>
}

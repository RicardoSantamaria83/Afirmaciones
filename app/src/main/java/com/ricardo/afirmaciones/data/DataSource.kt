package com.ricardo.afirmaciones.data

import com.ricardo.afirmaciones.R
import com.ricardo.afirmaciones.model.Afirmacion

class DataSource {
    fun cargarAfirmaciones(): List<Afirmacion> {
        return listOf<Afirmacion>(
            Afirmacion(R.string.afirmacion1),
            Afirmacion(R.string.afirmacion2),
            Afirmacion(R.string.afirmacion3),
            Afirmacion(R.string.afirmacion4),
            Afirmacion(R.string.afirmacion5),
            Afirmacion(R.string.afirmacion6),
            Afirmacion(R.string.afirmacion7),
            Afirmacion(R.string.afirmacion8),
            Afirmacion(R.string.afirmacion9),
            Afirmacion(R.string.afirmacion10),
        )

    }
}
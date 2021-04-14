package com.ricardo.afirmaciones.data

import com.ricardo.afirmaciones.R
import com.ricardo.afirmaciones.model.Afirmacion

class DataSource {
    fun cargarAfirmaciones(): List<Afirmacion> {
        return listOf<Afirmacion>(
            Afirmacion(R.string.afirmacion1, R.drawable.image1),
            Afirmacion(R.string.afirmacion2, R.drawable.image2),
            Afirmacion(R.string.afirmacion3, R.drawable.image3),
            Afirmacion(R.string.afirmacion4, R.drawable.image4),
            Afirmacion(R.string.afirmacion5, R.drawable.image5),
            Afirmacion(R.string.afirmacion6, R.drawable.image6),
            Afirmacion(R.string.afirmacion7, R.drawable.image7),
            Afirmacion(R.string.afirmacion8, R.drawable.image8),
            Afirmacion(R.string.afirmacion9, R.drawable.image9),
            Afirmacion(R.string.afirmacion10, R.drawable.image10),
        )

    }
}
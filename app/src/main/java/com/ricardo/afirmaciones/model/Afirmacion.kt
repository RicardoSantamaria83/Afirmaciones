package com.ricardo.afirmaciones.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Afirmacion(
        @StringRes val stringResourceId: Int,
        @DrawableRes val imageResourceId: Int) {
}
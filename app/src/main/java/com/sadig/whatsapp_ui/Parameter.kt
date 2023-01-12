package com.sadig.whatsapp_ui

import androidx.compose.ui.graphics.painter.Painter

data class Parameter(
    val icon : Painter,
    val key : String,
    val value : String,
    val description : String?,
    val Editable : Painter?
)

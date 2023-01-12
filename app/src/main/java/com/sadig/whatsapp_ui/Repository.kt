package com.sadig.whatsapp_ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

class Repository {
    companion object {
        @Composable
        fun getParams() : List<Parameter> {
            return listOf(
                Parameter(
                    painterResource(id = R.drawable.person),
                    "Name",
                    "Sadig Hasanzade",
                    "This is not your username or pin. This name will visible to your WhatsApp contacts.",
                    painterResource(id = R.drawable.edit)
                ),
                Parameter(
                    painterResource(id = R.drawable.info),
                    "About",
                    "Smart is new sexy",
                    description = null,
                    painterResource(id = R.drawable.edit)
                ),
                Parameter(
                    painterResource(id = R.drawable.phone),
                    "Phone",
                    "+994 50 827 88 24",
                    description = null,
                    null
                )
            )
        }
    }

}
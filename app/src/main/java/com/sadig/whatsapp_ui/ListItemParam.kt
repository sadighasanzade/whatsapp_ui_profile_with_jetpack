package com.sadig.whatsapp_ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.SemiBold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sadig.whatsapp_ui.ui.theme.*

@Composable
fun listItemParam(param : Parameter) {
    Row(modifier = Modifier.padding(10.dp),

     horizontalArrangement = Arrangement.spacedBy(10.dp)) {

        Image(painter = param.icon, contentDescription = "profile" ,
            modifier = Modifier
                .padding(0.dp)
            .size(35.dp)
            .weight(1f)
                .padding(all = 4.dp)
            , colorFilter = ColorFilter.tint(color = lightGray))

        Column(modifier = Modifier.weight(8f)) {
            Text(text = param.key, color = lightGray, fontSize = 15.sp)
            Text(text = param.value, color = Color.White, fontSize = 17.sp, fontWeight = SemiBold)
            param.description?.let {
                Text(text = it, color = lightGray, fontSize = 14.sp, modifier = Modifier.padding(top =  5.dp))
            }
        }

        param.Editable?.let {
            Image(painter = param.Editable, contentDescription = "Edit", modifier = Modifier
                .size(24.dp)
                .weight(1f), colorFilter = ColorFilter.tint(color = green) )
        }
    }
}



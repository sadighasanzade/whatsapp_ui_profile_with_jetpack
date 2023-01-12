package com.sadig.whatsapp_ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sadig.whatsapp_ui.ui.theme.*


@Composable
fun whatsappProfile() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = background)) {
        topBar()
        Spacer(modifier = Modifier.size(30.dp))
        profilePhoto()
        Spacer(modifier = Modifier.size(40.dp))
        setParams()
    }
}

@Composable
fun topBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(color = topBar),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Spacer(modifier = Modifier.size(12.dp))
        Icon(painter = painterResource(id = R.drawable.arrow_back),
            contentDescription = "back", tint = lightGray,
            modifier = Modifier.size(28.dp))

        Spacer(modifier = Modifier.size(30.dp))
        Text(
            text = "Profile",
            overflow = TextOverflow.Ellipsis,
            fontWeight = FontWeight.SemiBold,
            fontSize = 22.sp,
            color = Color.White
        )
    }
}

@Composable
fun RoundImage(
    image: Painter,
    modifier: Modifier = Modifier
) {
    Image(
        painter = image,
        contentDescription = null,
        modifier = modifier
            .aspectRatio(1f, matchHeightConstraintsFirst = true)
            .padding(3.dp)
            .clip(CircleShape)
    )
}

//camera
@Composable
fun camera() {
    Box(
        modifier = Modifier
            .height(60.dp)
            .width(60.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.round_background),
            contentDescription = "background",
            colorFilter = ColorFilter.tint(color = green),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .clip(CircleShape)
        )


        Image(
            painter = painterResource(id = R.drawable.camera),
            contentDescription = "camera",
            contentScale = ContentScale.Crop,
            colorFilter = ColorFilter.tint(color = Color.White),
            modifier = Modifier
                .height(25.dp)
                .width(25.dp)
        )

    }
}

//profile photo
@Composable
fun profilePhoto() {
    Row( modifier = Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.Center) {
        Box(
            modifier = Modifier
                .height(180.dp)
                .width(180.dp),
            contentAlignment = Alignment.BottomEnd
        ) {
            RoundImage(image = painterResource(id = R.drawable.profile)
                , modifier = Modifier
                    .fillMaxSize())
            camera()

        }
    }
}

@Composable
fun setParams() {
    val params : List<Parameter> = Repository.getParams();
    LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        modifier = Modifier.fillMaxWidth())
    {
        items(
            items = params,
            itemContent =  {
                listItemParam(param = it)
            }
        )
    }
}
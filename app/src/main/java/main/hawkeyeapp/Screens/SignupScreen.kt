package main.hawkeyeapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import main.hawkeyeapp.R
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import main.hawkeyeapp.Components.HeadingTextComponent
import main.hawkeyeapp.Components.NormalTextComponent

@Composable
fun SignupScreen() {
    Surface (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ){
        Column(modifier = Modifier.fillMaxSize()
            .padding(20.dp)
        ){
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_an_account))
        }
    }
}

@Preview
@Composable
fun previewSignupScreeen(){
    SignupScreen()
}

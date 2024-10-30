package com.example.jetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose.ui.theme.GreenJC
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LearnNavDrawer(Modifier.padding(innerPadding))

                }
            }
        }
    }
}

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun LearnTopAppBar(modifier: Modifier, ) {
//    val context = LocalContext.current.applicationContext
//    TopAppBar(title = { Text(text = "WhatsApp")},
//        navigationIcon = {
//            IconButton(onClick = {Toast.makeText(context, "Whatsapp" , Toast.LENGTH_SHORT).show() }) {
//                Icon(painter = painterResource(id = R.drawable.whatsapp), contentDescription =null )
//            }
//        }, colors = TopAppBarDefaults.topAppBarColors(
//            containerColor = GreenJC,
//            titleContentColor = Color.White,
//            navigationIconContentColor = Color.White
//        ),
//        actions = {
//            IconButton(onClick = {Toast.makeText(context, "Profile" , Toast.LENGTH_SHORT).show() }){
//                Icon(imageVector = Icons.Default.Person, contentDescription =null , tint = Color.White )
//            }
//            IconButton(onClick = {Toast.makeText(context, "Search" , Toast.LENGTH_SHORT).show() }){
//                Icon(imageVector = Icons.Default.Search, contentDescription =null , tint = Color.White )
//            }
//            IconButton(onClick = {Toast.makeText(context, "Menu" , Toast.LENGTH_SHORT).show() }){
//                Icon(imageVector = Icons.Default.Menu, contentDescription =null , tint = Color.White )
//            }
//
//
//
//        }
//    )
//}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LearnNavDrawer(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val coroutineScope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

git

}

@Preview
@Composable
fun LearnTopAppBarPreview() {
    JetpackComposeTheme {
        LearnNavDrawer(Modifier)
    }
}
package com.example.multiplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.multiplication.ui.theme.MultiplicationTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MultiplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    Column(
                        modifier = Modifier.background(Color.Yellow)
                    ) {
                        Text(text = "Create Your Account",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .padding(vertical = 120.dp)
                        )


                        TextField(value = "", onValueChange = {},
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            placeholder = {
                                Text(text = "Name")
                            },
                            leadingIcon = {
                                Icon(imageVector = Icons.Rounded.Person, contentDescription = null)
                            })

                        Spacer(modifier = Modifier.height(10.dp))

                        TextField(value = "", onValueChange = {},
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            placeholder = {
                                Text(text = "Add")
                            },
                            leadingIcon = {
                                Icon(imageVector = Icons.Rounded.LocationOn, contentDescription = null )
                            })

                        Spacer(modifier = Modifier.height(10.dp))

                        TextField(value = "", onValueChange = {},
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            placeholder = {
                                Text(text = "Email")
                            },
                            leadingIcon = {
                                Icon(imageVector = Icons.Rounded.Email, contentDescription = null)
                            })

                        Spacer(modifier = Modifier.height(10.dp))

                        TextField(value = "", onValueChange = {},
                            modifier = Modifier.align(Alignment.CenterHorizontally),

                            placeholder = {
                                Text(text = "Password")
                            },
                            leadingIcon = {
                                Icon(imageVector = Icons.Rounded.Lock, contentDescription = null )
                            })
                        Spacer(modifier = Modifier.height(10.dp))


                        Spacer(modifier = Modifier.height(10.dp))

                        Button(onClick = { /*TODO*/ }, modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .fillMaxWidth()
                            .padding(60.dp)) {
                            Text(text = "Register")
                        }

                    }
                }

            }
        }
    }
}

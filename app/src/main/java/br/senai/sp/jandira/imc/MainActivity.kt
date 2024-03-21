package br.senai.sp.jandira.imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imc.ui.theme.IMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
    fun Greeting() {
        Surface(
            modifier = Modifier
                .background(color = Color.White)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.White)
            ) {
                Column(
                    modifier = Modifier
                        .offset(x = 0, y = 2)
                        .height(150.dp)
                        .fillMaxWidth()
                        .background(Color(0xffeb1450))
                        .padding(top = 13.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(painterResource(id = R.drawable.imc), contentDescription = "Balança de Imc")

                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .height(380.dp)
                            .width(340.dp)
                            .padding(start = 50.dp)
                            .offset(y = -32.dp)
                            .shadow(32.dp, RectangleShape)
                            .background(
                                color = Color(0xFFE6DCDC),
                                shape = RoundedCornerShape(
                                    topStart = 10.dp,
                                    bottomEnd = 10.dp,
                                    topEnd = 10.dp,
                                    bottomStart = 10.dp
                                )
                            )
                    ) {
                        Text(
                            text = "Seus dados",
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 34.sp,
                            color = Color(0xffeb1450),
                            modifier = Modifier
                                .padding(top = 32.dp)
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Column(
                                modifier = Modifier
                                    .width(250.dp)
                                    .padding(start = 26.dp)

                            ) {
                                Text(
                                    text = "Seu peso:",
                                    color = Color(0xffeb1450),
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(top = 10.dp)
                                )
                                OutlinedTextField(
                                    value = "",
                                    onValueChange = {},
                                    label = {
                                        Text(
                                            text = "Seu peso em Kg"
                                        )
                                    },
                                    colors = OutlinedTextFieldDefaults.colors(
                                        unfocusedBorderColor = Color(0xffeb1450)
                                    )
                                )
                                Text(
                                    text = "Sua altura:",
                                    color = Color(0xffeb1450),
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(top = 10.dp)
                                )
                                OutlinedTextField(
                                    value = "",
                                    onValueChange = {},
                                    label = {
                                        Text(
                                            text = "Sua altura em metros"
                                        )
                                    },
                                    colors = OutlinedTextFieldDefaults.colors(
                                        unfocusedBorderColor = Color(0xffeb1450)
                                    )
                                )
                                Button(
                                    onClick = { /*TODO*/ },
                                    colors = ButtonDefaults
                                        .buttonColors(
                                            containerColor = Color(0xffeb1450)
                                        ),
                                    shape = RoundedCornerShape(6.dp),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(68.dp)
                                        .padding(top = 18.dp)
                                ) {
                                    Text(
                                        text = "CALCULAR",
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Medium,
                                        color = Color.White
                                    )
                                }
                            }
                        }
                    }
                    Box(
                        modifier = Modifier
                            .width(336.dp)
                            .height(130.dp)
                            .padding(top = 22.dp, start = 56.dp)
                            .shadow(32.dp, RectangleShape)
                            .background(
                                color = Color(0xFF308122),
                                shape = RoundedCornerShape(
                                    topStart = 10.dp,
                                    topEnd = 10.dp,
                                    bottomStart = 10.dp,
                                    bottomEnd = 10.dp
                                )
                            )
                            .border(
                                1.dp, color = Color.Red, shape = RoundedCornerShape(
                                    topStart = 10.dp,
                                    topEnd = 10.dp,
                                    bottomStart = 10.dp,
                                    bottomEnd = 10.dp
                                )
                            )
                    ) {
                        Row() {
                            Column {
                                Text(
                                    text = "Resultado",
                                    color = Color.White,
                                    fontSize = 16.sp,
                                    modifier = Modifier
                                        .padding(top = 20.dp, start = 46.dp)
                                )
                                Text(
                                    text = "Peso Ideal",
                                    color = Color.White,
                                    fontSize = 26.sp,
                                    modifier = Modifier
                                        .padding(top = 6.dp, start = 20.dp)
                                )
                            }
                            Column {
                                Text(
                                    text = "21.3",
                                    color = Color.White,
                                    fontWeight = FontWeight.ExtraBold,
                                    fontSize = 36.sp,
                                    modifier = Modifier
                                        .padding(top = 30.dp, start = 24.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IMCTheme {
        Greeting()
    }
}
package com.example.tutorials

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import com.example.tutorials.ui.theme.TutorialsTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
//        setContent {
//            TutorialsTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
//                    Greeting("Android")
//                }
//            }
//        }
//        Log.d("Manan","tera ghar jayenga isma")
        setContentView(R.layout.homescreen)
//        btnApply.setOnClickListener {//For Layout
//            val firstname=FirstName.text.toString()
//            val lastname=LastName.text.toString()
//            val birthdate=BirthDate.text.toString()
//            val country=Country.text.toString()
//            Log.d("Main Activity","$firstname $lastname, born on $birthdate in $country")
//        }
//        var count=0
//        Counter.setOnClickListener {
//            count++
//            tvCount.text="Counter:$count"
//        }
//        Output.setOnClickListener {
//            val inp1=Input1.text.toString().toInt()
//            val inp2=Input2.text.toString().toInt()
//            val sum=inp1+inp2
//            Result.text=sum.toString()
//
//
//        }
//        image1.setOnClickListener {
//            imageView2.setImageResource(R.drawable.elon)
//        }

    }

}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    var name="Naman"
//    Text(
//            text = "Hello $name!",
//            modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    TutorialsTheme {
//        Greeting("Android")
//    }
//}


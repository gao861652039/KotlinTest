package android.zh.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_tv_message.text = "Hello Kotlin!"
        main_tv_message.textSize = 20.0f
    }
    fun feature1(){
        println("hello")
    }

}

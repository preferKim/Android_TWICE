package com.preferkim.twice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toast.makeText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // 화면을 보여주는 코드

        // image1 클릭시 ImageInsideActivity로 이동
        val image1 = findViewById<ImageView>(R.id.member1)
        val image2 = findViewById<ImageView>(R.id.member2)
        val image3 = findViewById<ImageView>(R.id.member3)
        val image4 = findViewById<ImageView>(R.id.member4)
        val image5 = findViewById<ImageView>(R.id.member5)
        val image6 = findViewById<ImageView>(R.id.member6)
        val image7 = findViewById<ImageView>(R.id.member7)
        val image8 = findViewById<ImageView>(R.id.member8)
        val image9 = findViewById<ImageView>(R.id.member9)

        image1.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            // intent.putExtra("String Keyword", "String전달")
            intent.putExtra("data", "1") // "data" 박스 안에 "1" 이라는 값을 담는다
            startActivity(intent)

        }

        image2.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "2")
            startActivity(intent)

        }

        image3.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "3")
            startActivity(intent)

        }

        image4.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "4")
            startActivity(intent)

        }

        image5.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "5")
            startActivity(intent)

        }

        image6.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "6")
            startActivity(intent)

        }

        image7.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "7")
            startActivity(intent)

        }

        image8.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "8")
            startActivity(intent)

        }

        image9.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "9")
            startActivity(intent)

        }
    }

}
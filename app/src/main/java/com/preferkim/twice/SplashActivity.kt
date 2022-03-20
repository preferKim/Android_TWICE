package com.preferkim.twice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // SplashActivity -> MainActivity 이동
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 1000) // 1초 동안 SplashActivity를 보여줌

    }

    /*
    onCreate메서드 바깥 쪽에서는 Handler()가 인식되지 않는다.
     */
//    Handler().postDelayed({
//        startActivity(Intent(this, MainActivity::class.java))
//        finish()
//    }, 3000)
}
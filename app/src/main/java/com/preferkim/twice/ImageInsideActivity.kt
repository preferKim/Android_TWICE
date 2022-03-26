package com.preferkim.twice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

/*
멤버 이미지를 클릭하면 본 액티비티로 넘어와서, 클릭된 멤버의 이미지를 확대해서 보여준다.
 */
class ImageInsideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        // null Check: 전달된 Extra가 있는지 확인
        if (intent.hasExtra("data")) {
            Toast.makeText(this, intent.getStringExtra("data"), Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "에러: 전달된 Extra가 없음", Toast.LENGTH_LONG).show()
        }

        val getData = intent.getStringExtra("data")
        val memberImage = findViewById<ImageView>(R.id.memberImageArea)

        if (getData == "1") {
            // res/drawable 폴더의 member_1 이미지를 로드한다.
            memberImage.setImageResource(R.drawable.member_1)
        }

        if (getData == "2") {
            memberImage.setImageResource(R.drawable.member_2)
        }

        if (getData == "3") {
            memberImage.setImageResource(R.drawable.member_3)
        }

        if (getData == "4") {
            memberImage.setImageResource(R.drawable.member_4)
        }

        if (getData == "5") {
            memberImage.setImageResource(R.drawable.member_6)
        }

        if (getData == "7") {
            memberImage.setImageResource(R.drawable.member_7)
        }

        if (getData == "8") {
            memberImage.setImageResource(R.drawable.member_8)
        }

        if (getData == "9") {
            memberImage.setImageResource(R.drawable.member_9)
        }

    }
}
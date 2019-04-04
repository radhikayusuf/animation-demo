package id.radhika.animation_playground.demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import id.radhika.animation_playground.R
import kotlinx.android.synthetic.main.activity_motion_layout.*

class MotionLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion_layout)

        Glide.with(this)
            .load("https://timedotcom.files.wordpress.com/2016/07/spiderman-homecoming.jpg")
            .into(imageHeader)

    }
}

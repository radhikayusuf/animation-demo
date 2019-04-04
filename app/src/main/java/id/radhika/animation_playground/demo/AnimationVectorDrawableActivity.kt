package id.radhika.animation_playground.demo

import android.graphics.drawable.AnimatedVectorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import id.radhika.animation_playground.R
import kotlinx.android.synthetic.main.activity_animation_vector_drawable.*

class AnimationVectorDrawableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_vector_drawable)
    }


    fun transformImage(v: View){
        (imageVector.drawable as AnimatedVectorDrawable).start()
    }
}

package id.radhika.animation_playground

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import id.radhika.animation_playground.demo.AnimationDrawableActivity
import id.radhika.animation_playground.demo.AnimationVectorDrawableActivity
import id.radhika.animation_playground.demo.MotionLayoutActivity
import id.radhika.animation_playground.demo.ObjectAnimatorExampleActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onClickMenu(v: View) {
        when (v.id) {
            R.id.objectAnimator -> {
                startActivity(Intent(this, ObjectAnimatorExampleActivity::class.java))
            }
            R.id.animationDrawable -> {
                startActivity(Intent(this, AnimationDrawableActivity::class.java))
            }
            R.id.animationVectorDrawable -> {
                startActivity(Intent(this, AnimationVectorDrawableActivity::class.java))
            }
            R.id.motionLayout -> {
                startActivity(Intent(this, MotionLayoutActivity::class.java))
            }
        }
    }
}

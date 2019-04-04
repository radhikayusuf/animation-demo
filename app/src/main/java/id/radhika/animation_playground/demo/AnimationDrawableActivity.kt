package id.radhika.animation_playground.demo

import android.animation.ValueAnimator
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import id.radhika.animation_playground.R
import kotlinx.android.synthetic.main.activity_animation_drawable.*


class AnimationDrawableActivity : AppCompatActivity() {

    lateinit var mLoadingAnimation: AnimationDrawable
    lateinit var waitAnimator: ValueAnimator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_drawable)

        imageLoading.setImageResource(R.drawable.loading_animation_drawable)
        mLoadingAnimation = (imageLoading.drawable as AnimationDrawable)


        waitAnimator = ValueAnimator.ofInt(0, 3).apply {
            repeatCount = ValueAnimator.INFINITE
            repeatMode = ValueAnimator.RESTART
            duration = 800
            addUpdateListener {
                textPleaseWait.text = getString(R.string.text_please_wait).substring(0, 12 + (it.animatedValue as Int))
            }
        }

    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        mLoadingAnimation.start()
        waitAnimator.start()

    }
}

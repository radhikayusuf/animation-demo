package id.radhika.animation_playground.demo

import android.animation.*
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.BounceInterpolator
import id.radhika.animation_playground.R
import kotlinx.android.synthetic.main.activity_object_animator_example.*

class ObjectAnimatorExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_animator_example)


        val bounceScaleXImageAnimator =
            ObjectAnimator.ofFloat(imageContent, View.SCALE_X, 0f, 1f).apply {
                interpolator = BounceInterpolator()
                duration = 800
            }
        val bounceScaleYImageAnimator =
            ObjectAnimator.ofFloat(imageContent, View.SCALE_Y, 0f, 1f).apply {
                interpolator = BounceInterpolator()
                duration = 800
            }
        val alphaImageAnimator =
            ObjectAnimator.ofFloat(imageContent, View.ALPHA, 0f, 1f).apply {
                duration = 800
            }

        val alphaTextAnimator =
            ObjectAnimator.ofFloat(textContent, View.ALPHA, 0f, 1f).apply {
                duration = 800
            }



        val animatorSet = AnimatorSet().apply {
            play(alphaTextAnimator)
                .after(bounceScaleXImageAnimator)
                .after(bounceScaleYImageAnimator)
                .after(alphaImageAnimator)


            startDelay = 1000
        }
        animatorSet.start()

    }
}

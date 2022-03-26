package borboa.andrea.reel_proyectomoviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import borboa.andrea.reel_proyectomoviles.databinding.ActivityInicioBinding
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView

class Inicio : AppCompatActivity() {

    private lateinit var binding: ActivityInicioBinding

    private lateinit var sliderView: SliderView
    private var images = intArrayOf(R.drawable.godzilla_vs_kong,R.drawable.liga_de_la_justicia,R.drawable.el_seor_de_los_anillos,R.drawable.pastor_impostor)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityInicioBinding.inflate(layoutInflater)

        setContentView(binding.root)

        sliderView=findViewById(R.id.sliderView)
        val sliderAdapter = SliderAdapter(images)
        sliderView.setSliderAdapter(sliderAdapter)
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM)
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION)
        sliderView.startAutoCycle()
    }
}
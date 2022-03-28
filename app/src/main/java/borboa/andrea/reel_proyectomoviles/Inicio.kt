package borboa.andrea.reel_proyectomoviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import borboa.andrea.reel_proyectomoviles.databinding.ActivityInicioBinding
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView

class Inicio : AppCompatActivity() {


    //variables que se usan para llenar el sliderView(carousel de imagenes)
    private lateinit var binding: ActivityInicioBinding
    private lateinit var sliderView: SliderView

    private lateinit var recyclerView : RecyclerView



    //Lista de imagenes con las que se llenará el sliderView
    private var images = intArrayOf(R.drawable.godzilla_vs_kong,R.drawable.liga_de_la_justicia,R.drawable.el_seor_de_los_anillos,R.drawable.pastor_impostor)

    private var itemImages = intArrayOf(R.drawable.dosporuno,R.drawable.precio_especial_1,R.drawable.precio_especial_2,R.drawable.precio_especial_3)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //inflador del sliderView y vista
        binding= ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sliderView=findViewById(R.id.sliderView)

        recyclerView = findViewById(R.id.recyclerview)

        val recyclerViewAdapter = RecyclerViewAdapter(itemImages)

        val sliderAdapter = SliderAdapter(images)

        recyclerView.adapter(recyclerViewAdapter)

        sliderView.setSliderAdapter(sliderAdapter)



        //animaciones del sliderView
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM)
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION)
        //metodo para que el sliderView actualice las imagenes cada cierto tiempo
        sliderView.startAutoCycle()


    }


}
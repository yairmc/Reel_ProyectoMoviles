package borboa.andrea.reel_proyectomoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import java.util.ArrayList

class InicioActivity : AppCompatActivity() {
    private lateinit var CarouselRecyclerview: RecyclerView
    private lateinit var PromosRecyclerview: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)


        var btn_cines: Button = findViewById(R.id.btn_cines) as Button

        btn_cines.setOnClickListener{
            var intent: Intent = Intent(this, cines::class.java)
            startActivity(intent)
        }

        var btn_perfil: Button = findViewById(R.id.btn_perfil) as Button

        btn_perfil.setOnClickListener{
            var intent: Intent = Intent(this, PerfilActivity::class.java)
            startActivity(intent)
        }

        var btn_estrenos: Button = findViewById(R.id.btn_estrenos) as Button

        btn_estrenos.setOnClickListener {
            var intent: Intent = Intent(this, EstrenosActivity::class.java)
            startActivity(intent)
        }


        var btn_ubicacion: Button = findViewById(R.id.btn_ubicacion) as Button

        btn_ubicacion.setOnClickListener {
            var intent: Intent=Intent(this, UbicacionActivity::class.java)
            startActivity(intent)
        }



        //CarouselRecyclerView
        CarouselRecyclerview = findViewById(R.id.CarouselRecyclerview)
        CarouselRecyclerview.setHasFixedSize(true)
        CarouselRecyclerview.setLayoutManager(LinearLayoutManager(this, RecyclerView.HORIZONTAL, false))


        val imageList: MutableList<CarouselItem> = ArrayList<CarouselItem>()
        imageList.add(CarouselItem(R.drawable.godzilla_vs_kong))
        imageList.add(CarouselItem(R.drawable.liga_de_la_justicia))
        imageList.add(CarouselItem(R.drawable.el_seor_de_los_anillos))
        imageList.add(CarouselItem(R.drawable.pastor_impostor))
        val carouselAdapter = CarouselAdapter(imageList)
        CarouselRecyclerview.setAdapter(carouselAdapter)

        //PromosRecyclerView
        PromosRecyclerview = findViewById(R.id.PromosRecyclerview)
        PromosRecyclerview.setHasFixedSize(true)
        PromosRecyclerview.setLayoutManager(LinearLayoutManager(this, RecyclerView.VERTICAL, false))
        val promosList: MutableList<PromosItem> = ArrayList<PromosItem>()
        promosList.add(PromosItem(R.drawable.dosporuno))
        promosList.add(PromosItem(R.drawable.precio_especial_1))
        promosList.add(PromosItem(R.drawable.precio_especial_2))
        promosList.add(PromosItem(R.drawable.precio_especial_3))
        val promosAdapter = PromosAdapter(promosList)
        PromosRecyclerview.setAdapter(promosAdapter)
    }
}
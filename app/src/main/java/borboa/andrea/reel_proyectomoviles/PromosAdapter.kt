package borboa.andrea.reel_proyectomoviles

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class PromosAdapter:AppCompatActivity() {
    var img = ArrayList<imagen>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        agregaImagen()

        var listview: ListView = findViewById(R.id.listview) as ListView
        var adaptador: AdaptadorImagenes = AdaptadorImagenes(this, img)
        listview.adapter = adaptador

    }

    fun agregaImagen(){
        img.add(imagen(R.drawable.precio_especial_1))
        img.add(imagen(R.drawable.precio_especial_2))
        img.add(imagen(R.drawable.precio_especial_3))
    }

    private class AdaptadorImagenes: BaseAdapter {
        var img = ArrayList<imagen>()
        var contexto: Context? = null

        constructor(contexto: Context,img: ArrayList<imagen>){
            this.img= img
            this.contexto= contexto
        }

        override fun getCount(): Int {
            return img.size
        }

        override fun getItem(p0: Int): Any {
            return img[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var image = img[p0]
            var inflador = LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.promos_item,null)

            var imagen = vista.findViewById(R.id.imageItem) as ImageView

            imagen.setImageResource(image.image_promo)


            return vista
        }
    }
}
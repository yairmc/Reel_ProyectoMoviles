package borboa.andrea.reel_proyectomoviles

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EstrenosActivity : AppCompatActivity() {

    var listaEstrenos = ArrayList<Estrenos>()
    var adapter: EstrenosAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estrenos)

        agregarEstrenos()

        var listview: ListView = findViewById(R.id.lv_estrenos) as ListView
        var adaptador: EstrenosAdapter = EstrenosAdapter(this, listaEstrenos)
        listview.adapter = adaptador

    }

    fun agregarEstrenos() {
        listaEstrenos.add(Estrenos(R.drawable.cazador_de_mostruos,
            "Cazador de Mounstros",
            "Monster Hunter",
            "Un guerrero que colecciona las cabezas de sus enemigos trata de conseguir la que con más ansia desea: la del monstruo que mató a su hija."
        ))

    }

    class EstrenosAdapter : BaseAdapter {
        var listaEstrenos = ArrayList<Estrenos>()
        var contexto: Context? = null

        constructor(contexto: Context, listaEstrenos: ArrayList<Estrenos>) {
            this.listaEstrenos = listaEstrenos
            this.contexto = contexto
        }

        override fun getCount(): Int {
            return listaEstrenos.size
        }

        override fun getItem(p0: Int): Any {
            return listaEstrenos[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var lista = listaEstrenos[p0]
            var inflador = LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.estrenos_item, null)

            var imagen = vista.findViewById(R.id.img_estreno) as ImageView
            var titulo = vista.findViewById(R.id.titulo_estreno) as TextView
            var subtitulo = vista.findViewById(R.id.subTitulo) as TextView
            var sinopsis = vista.findViewById(R.id.sinopsis) as TextView

            imagen.setImageResource(lista.imagen)
            titulo.setText(lista.titulo)
            subtitulo.setText(lista.subtitulo)
            sinopsis.setText(lista.sinopsis)

            return vista
        }
    }
}
package borboa.andrea.reel_proyectomoviles

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class cines : AppCompatActivity() {

    val cines= ArrayList<cines_Item>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cines)

        agregaCines()

        var listview: ListView =findViewById(R.id.lv_cines)
        var adaptador: AdaptadorCines=AdaptadorCines(this, cines)
        listview.adapter = adaptador

    }

    fun agregaCines(){
        cines.add(cines_Item(R.drawable.cinepolis,"Cinépolis Bella Vista","Blvd. Rodolfo Elías Calles #1750. 85000 Cd. Obregón, Son.","2D,3D,Sala Junior",R.drawable.mapa1))
        cines.add(cines_Item(R.drawable.cinepolis,"Cinépolis Sendero Obregón","Plaza Sendero, Cd. Obregón, Son.","2D,3D,Sala Junior",R.drawable.mapa2))
    }


    private class AdaptadorCines: BaseAdapter{
        var cines= ArrayList<cines_Item>()
        var contexto: Context?=null

        constructor(contexto:Context, cines:ArrayList<cines_Item>){
            this.cines=cines
            this.contexto=contexto
        }

        override fun getCount(): Int {
            return cines.size
        }

        override fun getItem(p0: Int): Any {
            return cines[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

            var cine = cines[p0]
            var inflador = LayoutInflater.from(contexto)
            var vista= inflador.inflate(R.layout.item_cines, null)

            var imagen = vista.findViewById(R.id.imagen_cine) as ImageView
            var nombre = vista.findViewById(R.id.nombreCine) as TextView
            var direccion = vista.findViewById(R.id.direccion_cine) as TextView
            var salas = vista.findViewById(R.id.salas_cines) as TextView
            var mapa = vista.findViewById(R.id.mapa_cine) as ImageView

            imagen.setImageResource(cine.imagen_cine)
            nombre.setText(cine.nombre_cine)
            direccion.setText(cine.direccion_cine)
            salas.setText(cine.sala_cine)
            mapa.setImageResource(cine.mapa_cines)
            return vista

        }


    }



}
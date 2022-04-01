package borboa.andrea.reel_proyectomoviles

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
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
            "En Guerra Con el Abuelo ",
            "At war with my grandpa",
            "S/C",
            "94 min",
            "comedia",
            "Peter es un niño que se ve obligado a abandonar su habitación debido a que su abuelo recientemente viudo se traslada allí. De esta manera, el niño ve como única opción para retomar su cuarto declararle la guerra a su abuelo."
        ))
        listaEstrenos.add(Estrenos(R.drawable.cazador_de_mostruos,
            "El Padre ",
            "The Father",
            "S/C",
            "94 min",
            "Drama",
            "Anthony tiene casi 83 años. Vive solo en su apartamento de Londres y rechaza todos los auxiliares de enfermería que su hija, Anne, intenta imponerle. Pero Anne lo ve como una necesidad inevitable porque ya no va a poder visitarlo todos los días. Ha tomado la decisión de irse a vivir a París con el hombre que acaba de conocer."
        ))
        listaEstrenos.add(Estrenos(R.drawable.cazador_de_mostruos,
            "Judas y el Mesias Negro",
            "Judas and the Black Messiah",
            "S/C",
            "126 min",
            "Drama",
            "A fines de la década de 1960, el delincuente William Bill O'Neal es arrestado en Chicago después de intentar secuestrar un automóvil mientras se hacía pasar por un oficial federal. Se le acerca el agente especial del FBI Roy Mitchell, quien le ofrece que se retiren los cargos de O'Neal si él trabaja encubierto para la oficina."
        ))
        listaEstrenos.add(Estrenos(R.drawable.cazador_de_mostruos,
            "Relic: Herencia Maldita",
            "Relic(2022)",
            "B",
            "90 min",
            "Drama, Terror",
            "Luego de la misteriosa desaparición de Edna, Kay y su hija Sam viajan a la casa de campo de la abuela para comenzar su búsqueda. Al llegar, se encuentran con indicios de la inestabilidad mental de Edna y, mientras más tiempo pasen en la casa, una serie de eventos sobrenaturales las llevará a explorar el terror más oscuro que habita en sus mentes."
        ))
        listaEstrenos.add(Estrenos(R.drawable.cazador_de_mostruos,
            "Hermosa Venganza",
            "Promising Young Woman (2022)",
            "S/C",
            "113 min",
            "Comedia, Drama, Crimen",
            " Cassie tenía un brillante futuro por delante hasta que un acontecimiento inesperado truncó su carrera. Ahora nada en su vida es lo que parece: es inteligente, audaz y vive una doble vida de noche. Cassie tiene la oportunidad de enmendar todo lo que no salió bien en su pasado... vengándose de los culpables."
        ))
        listaEstrenos.add(Estrenos(R.drawable.cazador_de_mostruos,
            "Mortal Kombat",
            "Mortal Kombat (2021)",
            "S/C",
            "100 min",
            "Accion, Aventura",
            " En el Japón del siglo XVII, los asesinos de Lin Kuei dirigidos por Bi-Han matan a los guerreros del clan ninja rival Shirai Ryu, liderado por Hanzo Hasashi, incluyendo a Harumi (Yukiko Shinohara), su esposa y a su hijo Satoshi. Hanzo mata a los atacantes antes de ser asesinado por Bi-Han, lo que provoca que su alma sea condenada al Inframundo. Raiden, el dios del trueno, llega al lugar y pone a salvo a la hija pequeña de Hanzo, quien ha sobrevivido."
        ))
        listaEstrenos.add(Estrenos(R.drawable.cazador_de_mostruos,
            "Nomadland",
            "Nomadland (2020)",
            "S/C",
            "107 min",
            "Drama",
            " En el poblado de Empire, Nevada, Estados Unidos, en 2011, Fern pierde su empleo después del cierre de una fábrica de materiales de construcción, donde trabajó durante años, junto con su esposo, quien recientemente falleció. Fern decide vender la mayoría de sus pertenencias y comprar una furgoneta para vivir y viajar por el país en busca de trabajo, como nómada de hoy en día"
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

            var imagen =vista.findViewById(R.id.img_estreno) as ImageView
            var titulo = vista.findViewById(R.id.titulo_estreno) as TextView
            var subtitulo = vista.findViewById(R.id.subTitulo) as TextView
            var sinopsis = vista.findViewById(R.id.sinopsis) as TextView
            var clasificacion=vista.findViewById(R.id.clasificacion) as TextView
            var duracion = vista.findViewById(R.id.duracion)as TextView
            var categoria = vista.findViewById(R.id.categoria) as TextView

            imagen.setImageResource(lista.image)
            titulo.setText(lista.titulo)
            subtitulo.setText(lista.subtitulo)
            sinopsis.setText(lista.sinopsis)
            clasificacion.setText(lista.clasificacion)
            duracion.setText(lista.duracion)
            categoria.setText(lista.categoria)

            return vista
        }
    }
}
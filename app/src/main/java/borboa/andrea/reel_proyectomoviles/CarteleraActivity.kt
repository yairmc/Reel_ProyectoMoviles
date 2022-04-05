package borboa.andrea.reel_proyectomoviles

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class CarteleraActivity : AppCompatActivity() {


    val peliculas= ArrayList<peli>()
    val comentariosKong = ArrayList<calificaciones>()
    val comentariosCaos = ArrayList<calificaciones>()
    val comentariosProtector = ArrayList<calificaciones>()
    val comentariosKongUps = ArrayList<calificaciones>()
    val comentariosKongFinMundo = ArrayList<calificaciones>()
    val comentariosKongTunel = ArrayList<calificaciones>()
    val comentariosKongTomJerry = ArrayList<calificaciones>()
    val comentariosKongPinocho = ArrayList<calificaciones>()
    val comentariosJuega = ArrayList<calificaciones>()
    val comentariosMaravilla = ArrayList<calificaciones>()
    val comentariosCazador = ArrayList<calificaciones>()


    var adapter: ItemAdapter? = null
    var peliculasAdapter: ItemAdapter?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cartelera)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.selectedItemId = R.id.cartelera
        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {


                R.id.estrenos -> {
                    startActivity(
                        Intent(
                            applicationContext, EstrenosActivity::class.java
                        )
                    )
                    overridePendingTransition(0,0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.cines -> {
                    startActivity(
                        Intent(
                            applicationContext, cines::class.java
                        )
                    )
                    overridePendingTransition(0,0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.perfil -> {
                    startActivity(
                        Intent(
                            applicationContext, PerfilActivity::class.java
                        )
                    )
                    overridePendingTransition(0,0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.inicio ->{
                    startActivity(
                        Intent(
                            applicationContext, InicioActivity::class.java
                        )
                    )
                    overridePendingTransition(0,0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.cartelera -> return@OnNavigationItemSelectedListener true
            }
            false
        })

        cargarPeliculas()

        peliculasAdapter = ItemAdapter(this,peliculas)

        var gridView_movies:GridView = findViewById(R.id.gridview) as GridView

        gridView_movies.adapter=peliculasAdapter


    }

    fun cargarPeliculas(){

        comentariosKong.add(calificaciones(R.drawable.peon,"Rick Sanchez","25/marzo/2021",31,"Todo lo que me esperaba y más. Un poco lenta en algunas partes, pero esa batalla final hizo que valiera completamente la pena. 100% recomentada sobre todo si eres fan del Monsterverse ya que podemos esperar mucho más de esta saga de peliculas en el futuro. "))
        comentariosKong.add(calificaciones(R.drawable.peon,"Ryan StartedTheFire","25/marzo/2021",24,"Epico. Nada más que decir."))
        comentariosKong.add(calificaciones(R.drawable.peon,"Parry Hotter","25/marzo/2021",22,"las partes de acción estuvieron bien, pero hubo partes que se me hacian muy aburridas xp 4/5"))
        comentariosKong.add(calificaciones(R.drawable.peon,"Mr. Potato","25/marzo/2025",19,"Team Kong por siempre!!!"))
        comentariosKong.add(calificaciones(R.drawable.peon,"Joana K","25/marzo/2021",15,"La peli está buenisima, no era muy fan de las peliculas de el Monsterverse pero luego al ver algo tan genial creo que me dare el tiempo de ver las otras de godzila y kong. Espero que squen mas ;)"))
        comentariosKong.add(calificaciones(R.drawable.peon,"Arceus InmortaL","26/marzo/2021",8,"Todo lo que me esperaba y más. Un poco lenta en algunas partes, pero esa batalla final hizo que valiera completamente la pena. 100% recomentada sobre todo si eres fan del Monsterverse ya que podemos esperar mucho más de esta saga de peliculas en el futuro."))
        comentariosKong.add(calificaciones(R.drawable.peon,"skereeeee","26/marzo/2021",1,"Godzila con aliento atomico, pulso nuclear, regeneración instantanea y piel de obsidiana<<<<<<Kong puro madrazo limpio xdxd"))
        comentariosKong.add(calificaciones(R.drawable.peon,"M Shadows","26/marzo/2021",1,"No estaba seguro de como kong le iba a dar pelea a godzila. Sin hacer espoiler me sorprendio bastante. Claramente estas son versiones de los monstruos que se diferencian un poco de las que hemos visto antes."))

        comentariosCaos.add(calificaciones(R.drawable.peon,"sicklo","04/04/22",80,"Es maravillosa la pelicula, es refrescante ver algo con un nuevo estilo de producción"))










        peliculas.add(peli(R.drawable.king_kong,"Godzila vs Kong",
            "Acción",
            "Godzila vs Kong(2021)",
            "B",
            "113 min",
            "Adam Windward",
            "Rebeca Hall Alexander Skarsgárd Eliza Gonzales, Millie Bobby Brown",
            "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Kqg8zLgESyQ\" frameborder=\"0\" allowfullscreen></iframe>",
            "Godzilla y Kong, dos de las fuerzas más poderosas de un planeta habitado por aterradoras criaturas, se enfrentan en un espectacular combate que sacude los cimientos de la humanidad. Monarch se embarca en una misión de alto riesgo y pone rumbo hacia territorios inexplorados para descubrir los orígenes de estos dos titanes, en un último esfuerzo por tratar de salvar a dos bestias que parecen tener las horas contadas sobre la faz de la Tierra.",comentariosKong))
        peliculas.add(peli(R.drawable.caos_el_inicio,
            "Caos: El Inicio",
            "Aventura",
            "Caos: El inicio (2021)",
            "B",
            "109 min",
            "Doug Liman",
            "Tom Holland Nick Jonas Daisy Ridley Demián Bichir",
            "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/2PC3sAcblr8\" frameborder=\"0\" allowfullscreen></iframe>",
            "En un futuro no muy lejano, Todd Hewitt (Tom Holland) quien vive con sus padres en una ciudad donde las mujeres han desaparecido y los hombres han sido afectados por \"el ruido\" - una fuerza que exhibe todos sus pensamientos al conocimiento de los demás - se encuentra con Viola (Daisy Ridley), una joven misteriosa que ha aterrizado en su planeta. Mientras Todd jura protegerla y ponerla fuera de peligro, tendrá que descubrir su propia fuerza y desbloquear todos los obscuros secretos que guarda su planeta y su comunidad.",
            comentariosCaos))
        peliculas.add(peli(R.drawable.el_protector,
            "El Protector",
            "Acción",
            "El protector(2021)",
            "B",
            "107 min",
            "Robert Lorenz",
            "Liam Neeson Katheryn Winnick Teresa Ruiz",
            "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/dpR5rte-96w\" frameborder=\"0\" allowfullscreen></iframe>",
            "El protector es una cinta de acción y suspenso, dirigida por Robert Lorenz (Curvas de la vida), que sigue la historia de Jim (Liam Neeson), un veterano de la guerra de Vietnam que, a pesar de haber mantenido una vida funcional y normal después de la guerra, aún tiene que enfrentarse a visiones, pesadillas y secuelas de la experiencia. Finalmente ha decidido recluirse en un pequeño rancho de Arizona, tratando de alejarse de las grandes ciudades, pero sus esfuerzos por tranquilidad se ven truncados cuando encuentra a un joven mexicano escondido en su propiedad. Aunque trata de echarlo, escucha su historia y descubre que es perseguido por un implacable grupo de narcotraficantes, por lo que, contra toda expectativa, Jim decide que ayudarlo podría ser lo que le permita tener una redención.",
            comentariosKong))

        peliculas.add(peli(R.drawable.uuups,
            "UUUPS! 2 La Aventura Continúa",
            "Animación",
            "OOOPS! 2 the adventure continues (Alemania, 2020)",
            "AA",
            "86 min",
            "Toby Genkel",
            "-",
            "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/0QX7YG-l-jA\" frameborder=\"0\" allowfullscreen></iframe>",
            "Después de más de 147 días sin ver tierra, el suministro de alimentos en el Arca de Noé se está agotando. Los jóvenes héroes Finny y su mejor amigo Leah se encuentran en problemas después de desobedecer a sus padres y causar una avalancha accidental de alimentos en la cubierta de provisiones del arca que los arrastra a ellos y a la comida al mar. Ahora, solos en una balsa, los valientes jóvenes se embarcan una vez más en una serie de emocionantes aventuras para volver al arca y salvar a todos los animales.",
            comentariosKong))
        peliculas.add(peli(R.drawable.el_dia_del_fin_del_mundo,
            "El Día Del Fin Del Mundo",
            "Acción",
            "Greenland(2020)",
            "B",
            "119 min",
            "Ric Roman Waugh",
            "Morena Baccarin Gerard Butler David Denman",
            "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/6gjx6SVLkpE\" frameborder=\"0\" allowfullscreen></iframe>",
            "Una familia se embarca en un peligroso viaje mientras un cometa se lanza hacia la Tierra. A medida que el apocalipsis global se acerca, su increíble viaje culmina en un vuelo desesperado y de última hora a un posible refugio seguro.",
            comentariosKong))
        peliculas.add(peli(R.drawable.el_tunel,
            "El Tunel",
            "Thriller",
            "El tunel(2020)",
            "B",
            "105 min",
            "Pål Øie",
            "Thorbjørn Harr , Ylva Lyng Fuglerud , Lisa Carlehed",
            "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ZgmbdhPmM7k\" frameborder=\"0\" allowfullscreen></iframe>",
            "Noruega es conocida por sus más de mil túneles. Pero ¿qué pasa cuando ocurre un accidente dentro de uno de ellos? El túnel narra el caos que toma lugar cuando un camión se estrella dentro de uno de esos túneles que llevaba a varias personas a casa para Navidad. Las personas dentro del accidente quedan brutalmente atrapadas en un incendio mortal, con pocas horas para salvar sus vidas en un desorden que cada vez se vuelve más incontrolable. Con una tormenta de nieve en el exterior, un rescatista se dará cuenta que su propia hija está dentro del túnel, y a pesar de que la última vez que se vieron tuvieron una pelea acerca de la forma en que pasarían la Navidad tras la muerte de la madre de la niña, Stein está consciente de que podría ya nunca más celebrar las festividades con su hija a menos de que logre llegar hasta ella.",
            comentariosKong))

        peliculas.add(peli(R.drawable.tom_y_jerry,
            "Tom y Jerry",
            "Animación",
            "Tom & Jerry (Estados Unidos, 2021)",
            "AA",
            "102 min",
            "Tim Story",
            "Michael Peña Rob Delaney Colin Jost Chloë Grace Moretz",
            "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/9C9gUm4PVQI\" frameborder=\"0\" allowfullscreen></iframe>",
            "Cuando Jerry se muda al hotel más lujoso de Nueva York, en la víspera de ‘la boda del siglo’, Kayla —la organizadora del evento— contrata a Tom para deshacerse del nuevo huésped. La batalla campal entre el gato y el ratón es una amenaza potencial para destruir la carrera de Kayla, la boda y, posiblemente, al hotel mismo. El problema se agrava con la ambición diabólica de un miembro del staff, quien conspira en contra de los otros tres. En una vistosa combinación de animación clásica con escenas de acción en vivo, la nueva aventura de Tom y Jerry presenta un nuevo territorio para que estos icónicos personajes peleen y los obliga a tomar acciones impensables... ¡como trabajar juntos para salvar el día!",
            comentariosKong))
        peliculas.add(peli(R.drawable.pinocho,
            "Pinochio",
            "Fantasia",
            "Pinocchio (Italia, 2019)",
            "A",
            "120 min",
            "Matteo Garrone",
            "Marine Vacth Roberto Beningni Federico Lelapi Alida Baldari Calabria",
            "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/eQKb4uebd0E\" frameborder=\"0\" allowfullscreen></iframe>",
            "Geppetto, un viejo tallador de madera que elabora una marioneta, e inesperadamente, sucede algo mágico: el títere comienza a hablar y puede caminar, correr y comer como cualquier niño. Geppetto lo llama Pinocho y lo cría como su hijo. Pero a Pinocho le resulta difícil portarse bien. Fácilmente influenciable, cae de una desgracia a otra mientras es engañado, secuestrado y perseguido por bandidos a través de un mundo fantástico. Su fiel amiga, el Hada, trata de hacerle ver que su sueño -convertirse en un niño de verdad- no podrá hacerse realidad hasta que Pinocho finalmente cambie su conducta. ¿Lo logrará?",
            comentariosKong))
        peliculas.add(peli(R.drawable.juega_conmigo,
            "Juega Conmigo",
            "Terror",
            "Juega Conmigo (México, 2021)",
            "B",
            "80 min",
            "Adrián García Bogliano",
            "Rocío García Valerie Sais Emilio Beltrán Liz Dieppa",
            "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/BmypYO-x69w\" frameborder=\"0\" allowfullscreen></iframe>",
            "Sofía, una joven insegura, comienza a trabajar en una casa cuidando a dos hermanos de carácter problemático, que le harán su estancia sumamente difícil. Sin embargo, durante una noche en que los padres están ausentes, los niños serán acosados por una entidad demoníaca y Sofía tendrá que tomar parte en un terrorífico juego para intentar salvarlos.",
            comentariosKong))

        peliculas.add(peli(R.drawable.mujer_maravilla,
            "Mujer Maravilla",
            "Acción",
            "Wonder Woman 1984",
            "B",
            "151 min",
            "",
            "Gal Gadot Chris Pine Kristen Wiig Pedro Pascal",
            "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/w9IE5apTPrc\" frameborder=\"0\" allowfullscreen></iframe>",
            "Diana debe lidiar con un colega de trabajo y hombre de negocios, cuyo deseo de riqueza extrema envía al mundo por un camino de destrucción, después de que desaparece un antiguo artefacto que concede deseos.",
            comentariosKong))
        peliculas.add(peli(R.drawable.cazador_de_mostruos,
            "El Cazador De Monstruos",
            "Terror",
            "The Head Hunter (Estados Unidos, 2018)",
            "B15",
            "72 min",
            "Jordan Downey",
            "Christopher Rygh Cora Kaufman Aisha Ricketts",
            "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/t-tfbMcZ8Hc\" frameborder=\"0\" allowfullscreen></iframe>",
            "Un guerrero recorre parajes salvajes montado a caballo para coleccionar las cabezas de sus enemigos, trata de conseguir la que con más ansia desea: la del monstruo que mató a su hija. Su sed de venganza es la fuerza motriz de este cazador, donde la fantasía y el horror encuentran sus encarnaciones más físicas y cruentas.",
            comentariosKong))
        peliculas.add(peli(R.drawable.dime_cuando_tu,
            "Dime Cuando Tu",
            "Drama",
            "Dime cuanto tu (2021)",
            "B",
            "96 min",
            "Gerardo Gatica",
            "Jesús Zavala Ximena Romo Verónica Castro",
            "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/d0o7tEl7CP4\" frameborder=\"0\" allowfullscreen></iframe>",
            "Un adicto al trabajo pone en pausa su vida rutinaria para cumplir el sueño de su abuelo: visitar los lugares más emblemáticos de la Ciudad de México y encontrar el amor.",
            comentariosKong))
    }



    class ItemAdapter: BaseAdapter {
        var peliculas = ArrayList<peli>()
        var contexto: Context? = null

        constructor(contexto: Context, peliculas:ArrayList<peli>){
            this.contexto = contexto
            this.peliculas = peliculas
        }

        override fun getCount(): Int {
            return this.peliculas.size
        }

        override fun getItem(position: Int): Any {
            return peliculas[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var pelicula = peliculas[position]
            var inflator = contexto!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var vista = inflator.inflate(R.layout.cartelera_item, null)

            var image: ImageView = vista.findViewById(R.id.imagen_peliculacartelera) as ImageView
            var title: TextView = vista.findViewById(R.id.titulo_peliculacartelera) as TextView
            var categoria: TextView = vista.findViewById(R.id.categoria_peliculacartelera) as TextView

            image.setImageResource(pelicula.imagen)
            title.setText(pelicula.titulo)
            categoria.setText(pelicula.categoria)



            image.setOnClickListener{
                var intent = Intent(contexto, PeliculasActivity::class.java)
                val bundle = Bundle()

                bundle.putInt("imagen",pelicula.imagen)
                bundle.putString("titulo",pelicula.titulo)
                bundle.putString("categoria",pelicula.categoria)
                bundle.putString("subtitulo",pelicula.subtitulo)
                bundle.putString("clasificacion",pelicula.clasificacion)
                bundle.putString("duracion",pelicula.duracion)
                bundle.putString("director",pelicula.director)
                bundle.putString("reparto",pelicula.reparto)
                bundle.putString("videoUrl",pelicula.videoUrl)
                bundle.putString("sinopsis",pelicula.sinopsis)
                bundle.putSerializable("comentario",pelicula.comentario)
                intent.putExtras(bundle);
                contexto!!.startActivity(intent)
            }

            return vista

        }

    }
}
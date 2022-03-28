package borboa.andrea.reel_proyectomoviles

import android.widget.RatingBar

data class cines_Item (var imagen_cine:Int,
                       var nombre_cine:String,
                       var direccion_cine:String,
                       var calificacion_cines:RatingBar,
                       var mapa_cines:Int)
package borboa.andrea.reel_proyectomoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PerfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        var btn_inicio:Button = findViewById(R.id.btn_inicio)

        btn_inicio.setOnClickListener {
            var intent : Intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
        }


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

    }
}
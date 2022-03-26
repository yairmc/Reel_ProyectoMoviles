package borboa.andrea.reel_proyectomoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class iniciar_sesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_sesion)

        var btn_register: Button = findViewById(R.id.btn_register) as Button
        var btn_index: Button = findViewById(R.id.btn_index) as Button

        btn_register.setOnClickListener{
            var intent:Intent= Intent(this, registrarse::class.java)
            startActivity(intent)
        }

        btn_index.setOnClickListener {
            var intent: Intent=Intent(this, Inicio::class.java)
            startActivity(intent)
        }


    }


}
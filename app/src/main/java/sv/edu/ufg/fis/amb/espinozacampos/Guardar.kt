package sv.edu.ufg.fis.amb.espinozacampos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import sv.edu.ufg.fis.amb.espinozacampos.databinding.ActivityGuardarBinding

class Guardar : AppCompatActivity() {

    private  lateinit var binding: ActivityGuardarBinding
    private lateinit var db: BaseDatos
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuardarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        db = BaseDatos(this)
        binding.btnGuardar.setOnClickListener{
            val mensaje = binding.txtData.text.toString()
            val registro =  Registro(mensaje)
            db.insertarMensaje(registro)
            finish()
            Toast.makeText(this, "SE HA GUARDADO EL MENSJAE", Toast.LENGTH_LONG).show()
        }
    }
}
package sv.edu.ufg.fis.amb.espinozacampos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sv.edu.ufg.fis.amb.espinozacampos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNuevoRegistro.setOnClickListener{
            val intent = Intent(this,Guardar::class.java)
            startActivity(intent)
        }
    }
}
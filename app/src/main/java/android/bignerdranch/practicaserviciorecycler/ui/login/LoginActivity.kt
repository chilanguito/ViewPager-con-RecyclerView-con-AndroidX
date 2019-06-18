package android.bignerdranch.practicaserviciorecycler.ui.login

import android.bignerdranch.practicaserviciorecycler.R
import android.bignerdranch.practicaserviciorecycler.presenter.PresenterClas
import android.bignerdranch.practicaserviciorecycler.view.ListActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
       val lista= PresenterClas.invocarGet()

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val login = findViewById<Button>(R.id.login)
        val loading = findViewById<ProgressBar>(R.id.loading)


            login.setOnClickListener {
                loading.visibility = View.VISIBLE

                val intent= Intent(this,ListActivity::class.java)
                intent.putExtra("LLAVE",lista)
                startActivity(intent)
            }
        }

}

package com.duoc.grupo.pvm.testcalendar

//import android.support.v7.app.AppCompatActivity
import android.app.Activity
//import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_buscar.*
import kotlinx.android.synthetic.main.activity_horario.*
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.activity_mi_perfil.*


class Menu : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //Lavado de cara
        window.decorView.setBackgroundColor(Color.WHITE)

        //Mensaje Inicial
        Toast.makeText(this, "Este menú no es funcional total. Gracias por su paciencia.", Toast.LENGTH_LONG).show()

        //Salir a la escucha vuelve al formulario de loguin

        btnSalir.setOnClickListener {
                v:View? -> startActivity(Intent(this, Login::class.java).apply {
                         //putExtra("extra_1", value1)
                         //putExtra("extra_2", value2)
                         //putExtra("extra_3", value3)
                        })
            }


        btnBuscarMenu.setOnClickListener{
             v: View? -> startActivity(Intent(this, Buscar::class.java).apply {
            //putExtra("extra_1", value1)
            //putExtra("extra_2", value2)
            //putExtra("extra_3", value3)
        })
        }

        btnMiPerfilMenu.setOnClickListener {
                v:View? ->  startActivity(Intent(this, MiPerfil::class.java).apply {
            //putExtra("extra_1", value1)
            //putExtra("extra_2", value2)
            //putExtra("extra_3", value3)
        })
        }

        btnMiCalendarioMenu.setOnClickListener {
                v:View? ->  startActivity(Intent(this, Horario::class.java).apply {
            //putExtra("extra_1", value1)
            //putExtra("extra_2", value2)
            //putExtra("extra_3", value3)
        })
        }

        btnDondeEstoy.setOnClickListener {
                v:View? ->  startActivity(Intent(this, MapsActivity::class.java).apply {
            //putExtra("extra_1", value1)
            //putExtra("extra_2", value2)
            //putExtra("extra_3", value3)
        })
        }

        btnDondeEstoyMenu.setOnClickListener {
                v:View? ->  startActivity(Intent(this, MostrarSala::class.java).apply {
            //putExtra("extra_1", value1)
            //putExtra("extra_2", value2)
            //putExtra("extra_3", value3)
        })
        }



        txtAcercaDe.setOnClickListener {
                v:View? ->  startActivity(Intent(this, AcercaDe::class.java).apply {
            //putExtra("extra_1", value1)
            //putExtra("extra_2", value2)
            //putExtra("extra_3", value3)
        })
        }


    }//onCreate
}//Class

/*val btnOpc1 : ImageButton = findViewById(R.id.btnBuscarMenu) as ImageButton
btnBuscarMenu.setOnClickListener{
view -> buscar1()
}

val btnOpc2 :mageButton = findViewById(R.id.btnDondeEstoyMenu) as ImageButton
btnBuscarMenu.setOnClickListener{
view -> // colocas el metodo aqui
}

val btnOpc3 : ImageButton = findViewById(R.id.btnMiPerfilMenu) as ImageButton
btnBuscarMenu.setOnClickListener{
view -> // colocas el metodo aqui
}

val btnOpc4 : ImageButton = findViewById(R.id.btnMiCalendarioMenu) as ImageButton
btnBuscarMenu.setOnClickListener{
view -> // colocas el metodo aqui
}

val btnOpc5 : ImageButton = findViewById(R.id.btnDondeEstoy) as ImageButton
btnBuscarMenu.setOnClickListener{
view -> // colocas el metodo aqui
}

val btnOpc6 : ImageButton = findViewById(R.id.btnSalir) as ImageButton
btnBuscarMenu.setOnClickListener{
view -> // colocas el metodo aqui
}

fun buscar(){
startActivity(Intent(this, buscar1::class.java).apply {
//putExtra("extra_1", value1)
//putExtra("extra_2", value2)
//putExtra("extra_3", value3)
})
}

fun horario(){
startActivity(Intent(this, horario::class.java).apply {
//putExtra("extra_1", value1)
//putExtra("extra_2", value2)
//putExtra("extra_3", value3)
})
}

fun dondeDeboIrHoy(){
startActivity(Intent(this, donde_debo_ir_hoy::class.java).apply {
//putExtra("extra_1", value1)
//putExtra("extra_2", value2)
//putExtra("extra_3", value3)
})
}

fun mostrarSala(){
startActivity(Intent(this, mostrarSala()::class.java).apply {
//putExtra("extra_1", value1)
//putExtra("extra_2", value2)
//putExtra("extra_3", value3)
})
}


fun BuscarMenu(){
startActivity(Intent(this, Menu::class.java).apply {
//putExtra("extra_1", value1)
//putExtra("extra_2", value2)
//putExtra("extra_3", value3)
})
}

fun BuscarMenu2(){
startActivity(Intent(this, Menu::class.java).apply {
//putExtra("extra_1", value1)
//putExtra("extra_2", value2)
//putExtra("extra_3", value3)
})
}

fun BuscarMenu3(){
startActivity(Intent(this, Menu::class.java).apply {
//putExtra("extra_1", value1)
//putExtra("extra_2", value2)
//putExtra("extra_3", value3)
})
}

}//ONCREATE
//CLASS
}*/
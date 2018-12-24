package com.duoc.grupo.pvm.testcalendar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
//import android.text.Editable
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_buscar.*
import kotlinx.android.synthetic.main.activity_menu.*

class Buscar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscar)
        //Buscar Por fecha

        btnBuscarSala.setOnClickListener {
                v: View? ->  startActivity(Intent(this, MostrarSala::class.java).apply {
                //putExtra("extra_1", value1)
                //putExtra("extra_2", value2)
                //putExtra("extra_3", value3)
            })
        }
        //Donde debo ir hoy
        /*btnDondeEstoyMenu.setOnClickListener {
                v: View? ->  startActivity(Intent(this, MostrarSala::class.java).apply {
            //putExtra("extra_1", value1)
            //putExtra("extra_2", value2)
            //putExtra("extra_3", value3)
        })
        }*/

        //Calendario a la escucha
        cvCalendario.setOnClickListener {
                v: View? -> setFechaBusqueda()
        }

        //Volver al menu
        btnVolverAlMenu.setOnClickListener {
                v: View? -> startActivity(Intent(this, Menu::class.java).apply {
                //putExtra("extra_1", value1)
                //putExtra("extra_2", value2)
                //putExtra("extra_3", value3)
            })
        }//btnVolverAlMenu



    }//OnCreate
    //Configuramos la fecha
    fun setFechaBusqueda() : Boolean {
        var strFecha = cvCalendario.toString()
        if(strFecha.trim().toString()==""){
            Toast.makeText(this,"Debe Ingresar una fecha válida.",Toast.LENGTH_LONG).show()
            return false
        }else {
            etFechaDeBusqueda.text.clear()
            etFechaDeBusqueda.text.append(strFecha)
            return true
        }
    }
}//class Buscar


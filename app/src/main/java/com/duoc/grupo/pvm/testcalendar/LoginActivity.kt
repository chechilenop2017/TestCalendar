package com.duoc.grupo.pvm.testcalendar

import android.content.Intent
//import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity
import android.graphics.Color
//import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
//import android.widget.TextView
import android.widget.Toast
import com.google.android.gms.ads.MobileAds;
import kotlinx.android.synthetic.main.activity_login.*

class Login : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //Una lavada de cara
        window.getDecorView().setBackgroundColor(Color.WHITE)
        //Boton Ingresar -> OK
        val btnIngresar : Button = findViewById(R.id.btnIngresarLogin) as Button
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713")
        btnIngresar.setOnClickListener{
                v: View? ->if(!validarPass()) Toast.makeText(this,"Debe Ingresar Valores A Las Cajas De Texto.",Toast.LENGTH_SHORT).show()
        }
        //Boton Salir -> OK
        btnSalirApp.setOnClickListener {
                v: View? ->  finish()
            }

    }//Class

    fun validarPass():Boolean
    {
        val ingresarId = findViewById(R.id.TxtIngresaTuID) as EditText // Input USER
        val ingresarClave = findViewById(R.id.TxtPassword) as EditText // Input PASS
        //val textMensajeError = findViewById(R.id.txtMensajeError) as TextView // Mensaje de Error
        var encontrado = false

        //Recogemos los datos desde el formulario
        var user = ingresarId.text.trim().toString()
        var pass = ingresarClave.text.trim().toString()

        //Verificamos que los campos tengas datos:
        if(user!="" && pass!="") {//Tienen datos!!

            //Generamos una coleccion de personas
            val personas: MutableList<Persona> = mutableListOf()

            //Añadimos las claves que necesitamos
            //Y algunos datos importantes
            val david: Persona = Persona()
            david.nombreUsuario = "david"
            david.claveUsuario = "usuario1"

            val rafael: Persona = Persona()
            rafael.nombreUsuario = "rafael"
            rafael.claveUsuario = "usuario2"

            val patricia: Persona = Persona()
            patricia.nombreUsuario = "patricia"
            patricia.claveUsuario = "usuario3"

            val invitado: Persona = Persona()
            invitado.nombreUsuario = "invitado"
            invitado.claveUsuario = "usuario"

            //Agregamos los usuarios creados
            personas.add(0, david)
            personas.add(1, rafael)
            personas.add(2, patricia)
            personas.add(3, invitado)

            //Buscamos una persona de acuerdo a las credenciales entregadas
            for (persona in personas) {
                if (persona.claveUsuario.trim().compareTo(pass.trim()) == 0 && persona.nombreUsuario.trim().compareTo(
                        user.trim()
                    ) == 0
                ) {
                    encontrado = true
                    break
                }
            }
            //Vaalidamos si ha sido encontrado y de acuerdo al resultado se muestra lasiguiente actividad(Menu)
            if (encontrado) {
                Toast.makeText(this, "Usuario Valido, Bienvenid@ ${user.toUpperCase()}", Toast.LENGTH_SHORT).show()
                val intento1 = Intent(this, Menu::class.java)
                startActivity(intento1).apply {
                    //putExtra("extra_1", value1)
                    //putExtra("extra_2", value2)
                    //putExtra("extra_3", value3)
                }
            } else {
                Toast.makeText(this, "Usuario Inválido vuelva a intentarlo", Toast.LENGTH_SHORT).show()
                TxtIngresaTuID.setSelection(1, TxtIngresaTuID.text.length)
                TxtPassword.setSelection(1, TxtPassword.text.length)
            }//IF-ELSE
        }//IF
        return encontrado//TRUE ó FALSE
    }//ValidarPass()
}//Class
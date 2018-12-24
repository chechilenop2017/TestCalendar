    package com.duoc.grupo.pvm.testcalendar

    import android.content.Intent
    import android.support.v7.app.AppCompatActivity
    import android.os.Bundle
    import android.view.View
    import kotlinx.android.synthetic.main.activity_mi_perfil.*

    class MiPerfil : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_mi_perfil)
            //Setear los datos de una persona-->Alumno

            //Volver
            btnMiPerfil.setOnClickListener {
                    v:View?->
                startActivity(Intent(this, Menu::class.java).apply {
                    //putExtra("extra_1", value1)
                    //putExtra("extra_2", value2)
                    //putExtra("extra_3", value3)
                })

            }
        }
    }


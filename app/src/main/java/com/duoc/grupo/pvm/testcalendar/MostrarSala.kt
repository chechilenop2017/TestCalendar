package com.duoc.grupo.pvm.testcalendar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_mostrar_sala.*

class MostrarSala : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_sala)

        btnVolverMenuMostrarSala.setOnClickListener {
                v: View ->
            startActivity(Intent(this, Buscar::class.java).apply {
                //putExtra("extra_1", value1)
                //putExtra("extra_2", value2)
                //putExtra("extra_3", value3)
            })
        }
    }
}

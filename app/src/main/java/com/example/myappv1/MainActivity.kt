package com.example.myappv1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //chamado apenas uma vez
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //abre o layout xml
        //abrir conexao com BD aqui
        setContentView(R.layout.activity_main)
        //criacao do onclicklistener para capturar a digitação do usuário
        val button = findViewById<Button>(R.id.btn_click);
        val edtNome = findViewById<EditText>(R.id.edt_Nome);
        val txtResult = findViewById<TextView>(R.id.txv_Resultado);

            button.setOnClickListener{
                var nome = edtNome.editableText.toString();
                txtResult.text = nome;

                val intent = Intent(this,ProximaActivity::class.java);
                startActivity(intent);

            }
    }


    ////--------
    //onRestart chama aqui
    override fun onStart() {
        super.onStart();
        Log.i("onStart", "OnStart Ativado");
    }

    ////--------

    override fun onResume() {
        super.onResume()
        Log.i("onResume", "onResume Ativado");
    }


    ////--------
    //ativa quando saio da página
    override fun onPause() {
        super.onPause();
        Log.i("onPause", "onPause Ativado");
    }

    // ------
//inicia o processo de stop
    override fun onStop() {
        super.onStop()
        Log.i("onStop", "onStop Ativado");

    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onRestart() {
        super.onRestart()
    }



}
package com.example.conversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)


    btnChange.setOnClickListener(View.OnClickListener {
      var valor= edtValor.text.toString().toDouble()
      var conversao = edtConversao.text.toString().toDouble()

      var total = valor/conversao

      txtTotal.text=total.toString()
    })
  }





}

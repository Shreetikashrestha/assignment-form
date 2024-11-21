package com.example.newproject

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText


class assignment : AppCompatActivity() {

    lateinit var heading1: TextView
    lateinit var heading2: TextView
    lateinit var subheading: TextView


    lateinit var editfirstName : TextInputEditText
    lateinit var editlastName : TextInputEditText
    lateinit var editEmail : TextInputEditText
    lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_assignment)

       heading1=findViewById(R.id.txt1)
       heading2=findViewById(R.id.txt2)
       subheading=findViewById(R.id.txt3)
        editfirstName = findViewById(R.id.fname)
        editlastName = findViewById(R.id.lastname)
        editEmail = findViewById(R.id.password)
        btn = findViewById(R.id.signup)


        btn.setOnClickListener {

        }
    }
}
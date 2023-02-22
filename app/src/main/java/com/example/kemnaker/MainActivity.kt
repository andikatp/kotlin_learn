package com.example.kemnaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {

    lateinit var tietNama: EditText
    lateinit var tietEmail: EditText
    lateinit var tietTelepon: EditText
    lateinit var tietBukuTamu: EditText
    lateinit var rgKelamin: RadioGroup
    lateinit var cbGame: CheckBox
    lateinit var cbBerenang: CheckBox
    lateinit var cbMemancing: CheckBox
    lateinit var bKirim: Button
    lateinit var bReset: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tietNama = findViewById<EditText>(R.id.tietNama)
        tietEmail = findViewById<EditText>(R.id.tietEmail)
        tietTelepon = findViewById<EditText>(R.id.tietTelepon)
        tietBukuTamu = findViewById<EditText>(R.id.tietBukuTamu)
        rgKelamin = findViewById<RadioGroup>(R.id.rgKelamin)
        cbGame = findViewById<CheckBox>(R.id.cbGame)
        cbBerenang = findViewById<CheckBox>(R.id.cbBerenang)
        cbMemancing = findViewById<CheckBox>(R.id.cbMemancing)
        bKirim = findViewById<Button>(R.id.bKirim)
        bReset = findViewById<Button>(R.id.bReset)


        bKirim.setOnClickListener {
            if (tietNama.text.isEmpty() ||
                tietEmail.text.isEmpty() ||
                tietTelepon.text.isEmpty() ||
                tietBukuTamu.text.isEmpty() ||
                rgKelamin.checkedRadioButtonId <= 0 ||
                (!cbGame.isChecked && !cbBerenang.isChecked && !cbMemancing.isChecked)
            ) {
                Toast.makeText(this, "Semua form harus diisi", Toast.LENGTH_SHORT).show()
            } else {
                val name = tietNama.text.toString()
                val intent = Intent(this, SecondPage::class.java)
                intent.putExtra("Name", name)
                startActivity(intent)
                clear()
            }
        }

        bReset.setOnClickListener {
            clear()
        }

    }

    fun clear() {
        tietNama.text.clear()
        tietEmail.text.clear()
        tietTelepon.text.clear()
        tietBukuTamu.text.clear()
        rgKelamin.clearCheck()
        cbGame.isChecked = false
        cbBerenang.isChecked = false
        cbMemancing.isChecked = false
    }
}



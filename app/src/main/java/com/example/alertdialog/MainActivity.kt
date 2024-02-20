package com.example.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDialog.setOnClickListener {
            val dialog = AlertDialog.Builder(this)

            dialog.setTitle("Delete Files")
            dialog.setMessage(R.string.des)
            dialog.setIcon(R.drawable.baseline_delete_forever_24)

            dialog.setPositiveButton("YES"){dialogInterface , which ->
                Toast.makeText(this , "Clicked Yes", Toast.LENGTH_SHORT).show()
            }
            dialog.setNegativeButton("NO"){dialogInterface , which ->
                Toast.makeText(this, "Clicked No", Toast.LENGTH_SHORT).show()
            }
            dialog.setNeutralButton("CANCEL"){dialogInterface , which ->
                Toast.makeText(this, "Clicked CANCEL", Toast.LENGTH_SHORT).show()
            }

            val alertDialog:AlertDialog = dialog.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}
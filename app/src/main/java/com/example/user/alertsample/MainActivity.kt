package com.example.user.alertsample

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {


       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickShowAlert(view: View) {
        // Build the alert dialog.
        val myAlertBuilder = AlertDialog.Builder(this@MainActivity)
        // Set the dialog title.
        myAlertBuilder.setTitle(R.string.alert_title)
        // Set the dialog message.
        myAlertBuilder.setMessage(R.string.alert_message)
        // Add the buttons.
        myAlertBuilder.setPositiveButton(R.string.ok) { dialog, which ->
            // User clicked OK button.
            Toast.makeText(applicationContext, R.string.pressed_ok,
                    Toast.LENGTH_SHORT).show()
        }
        myAlertBuilder.setNegativeButton(R.string.cancel) { dialog, which ->
            // User clicked the CANCEL button.
            Toast.makeText(applicationContext, R.string.pressed_cancel,
                    Toast.LENGTH_SHORT).show()
        }

        // Create and show the AlertDialog.
        myAlertBuilder.show()

    }
}
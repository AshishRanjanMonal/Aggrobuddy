package com.example.ashish

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class LoginActivity : AppCompatActivity() {


    lateinit var MobileNumber: EditText
    lateinit var Password: EditText
    lateinit var login: Button
    lateinit var ForgotPassword: TextView
    lateinit var TextRegister: TextView
    val validMobileNumber = arrayOf(
        "6206416452",
        "7050725092",
        "7301333267",
        "6206754294",
        "7903434940",
        "9097953334",
        "8541945409",
        "7368032277"
    )
    val validPassword = arrayOf(
        "Monal@123",
        "Shubham@123",
        "Hritik@123",
        "Saad@123",
        "Rahul@123",
        "Amit@123",
        "Vishnu@123",
        "Ragini@123"
    )
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences =
            getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)

        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false)
        setContentView(R.layout.activity_main2)
        if (isLoggedIn) {
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        setContentView(R.layout.activity_main2)
        title = "Log In"

        MobileNumber = findViewById(R.id.edit_queryMobileNumber)
        Password = findViewById(R.id.edit_queryPassword)
        login = findViewById(R.id.buttonPanellogin)
        ForgotPassword = findViewById(R.id.textForgotPassword)
        TextRegister = findViewById(R.id.textRegister)



        login.setOnClickListener {

            val mobileNumber = edit_queryMobileNumber.text.toString()
            val password = edit_queryPassword.text.toString()

            var nameOfPersonLogin = "Person"
            val a = 1

            val intent = Intent(this@LoginActivity, MainActivity::class.java)


            if (a != 0) {
                if ((mobileNumber == validMobileNumber[0]) && (password == validPassword[0])) {
                    nameOfPersonLogin = "Welcome Ashish Ranjan"
                    saveprefrences(nameOfPersonLogin)

                    startActivity(intent)
                } else if ((mobileNumber == validMobileNumber[1]) && (password == validPassword[1])) {

                    nameOfPersonLogin = "Welcome Shubham Mehta"
                    saveprefrences(nameOfPersonLogin)

                    startActivity(intent)
                } else if ((mobileNumber == validMobileNumber[2]) && (password == validPassword[2])) {

                    nameOfPersonLogin = "Welcome Hritik Raj"
                    saveprefrences(nameOfPersonLogin)

                    startActivity(intent)
                } else if ((mobileNumber == validMobileNumber[3]) && (password == validPassword[3])) {

                    nameOfPersonLogin = "Welcome Saad Farnquee"
                    saveprefrences(nameOfPersonLogin)

                    startActivity(intent)
                } else if ((mobileNumber == validMobileNumber[4]) && (password == validPassword[4])) {

                    nameOfPersonLogin = "Welcome Rahul Malhotra"
                    saveprefrences(nameOfPersonLogin)

                    startActivity(intent)
                } else if ((mobileNumber == validMobileNumber[5]) && (password == validPassword[5])) {

                    nameOfPersonLogin = "Welcome Amit"
                    saveprefrences(nameOfPersonLogin)

                    startActivity(intent)
                } else if ((mobileNumber == validMobileNumber[6]) && (password == validPassword[6])) {

                    nameOfPersonLogin = "Welcome Vishnu Kumar"
                    saveprefrences(nameOfPersonLogin)

                    startActivity(intent)
                } else if ((mobileNumber == validMobileNumber[7]) && (password == validPassword[7])) {

                    nameOfPersonLogin = "Welcome Ragini Singh"
                    saveprefrences(nameOfPersonLogin)

                    startActivity(intent)
                } else {
                    Toast.makeText(this@LoginActivity, "Invalid Credential", Toast.LENGTH_LONG)
                        .show()
                }

            }

        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }

    fun saveprefrences(title: String) {
        sharedPreferences.edit().putBoolean("isLoggedIn", true).apply()
        sharedPreferences.edit().putString("nameOfPersonLogin", title).apply()
    }


}


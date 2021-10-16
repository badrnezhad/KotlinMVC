package net.holosen.mvcapp.views

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import net.holosen.mvcapp.R
import net.holosen.mvcapp.controllers.ILoginController
import net.holosen.mvcapp.controllers.LoginController

class MainActivity : AppCompatActivity(), ILoginView {
    private lateinit var email: EditText
    private lateinit var password: EditText
    lateinit var loginBtn: Button
    lateinit var loginController: ILoginController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.email)
        password = findViewById(R.id.password)

        loginBtn = findViewById(R.id.loginb)
        loginController = LoginController(this)

        loginBtn.setOnClickListener {
            loginController.onLogin(
                email.text.toString(),
                password.text.toString()
            )
        }
    }

    override fun onLoginSuccess(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    override fun onLoginError(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
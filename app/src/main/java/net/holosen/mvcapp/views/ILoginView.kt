package net.holosen.mvcapp.views

interface ILoginView {
    fun onLoginSuccess(message: String?)
    fun onLoginError(message: String?)
}
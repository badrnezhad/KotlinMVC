package net.holosen.mvcapp.models

import android.text.TextUtils
import android.util.Patterns

data class User(var email: String, var password: String) : IUser {
    override fun isValid(): Int {
        // 0. Check for Email Empty
        // 1. Check for Email Match pattern
        // 2. Check for Password < 6

        return if (TextUtils.isEmpty(email))
            0;
        else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
            1;
        else if (TextUtils.isEmpty(password))
            2;
        else if (password.length <= 6)
            3;
        else
            -1;
    }
}

package app.folder.example.dell.Cardio_Folder_2022.Prefs

import android.content.Context
import android.content.SharedPreferences
import app.folder.example.dell.Cardio_Folder_2022.R

class PrefConfig(private val context: Context) {
    private val sharedPreferences: SharedPreferences
    fun writeLoginStatus(status: Boolean) {
        val editor = sharedPreferences.edit()
        editor.putBoolean(context.getString(R.string.pref_login_status), status)
        editor.apply()
    }

    fun readLoginStatus(): Boolean {
        return sharedPreferences.getBoolean(context.getString(R.string.pref_login_status), false)
    }

    fun writeUid(Uid: String?) {
        val editor = sharedPreferences.edit()
        editor.putString(context.getString(R.string.pref_user_Uid), Uid)
        editor.apply()
    }

    fun readUid(): String {
        return sharedPreferences.getString(context.getString(R.string.pref_user_Uid), "123")
    }

    fun writeTeam(team: String?) {
        val editor = sharedPreferences.edit()
        editor.putString(context.getString(R.string.pref_user_Team), team)
        editor.apply()
    }

    fun readTeam(): String {
        return sharedPreferences.getString(context.getString(R.string.pref_user_Team), "null")
    }

    fun writeName(name: String?) {
        val editor = sharedPreferences.edit()
        editor.putString(context.getString(R.string.pref_user_Name), name)
        editor.apply()
    }

    fun readName(): String {
        return sharedPreferences.getString(context.getString(R.string.pref_user_Name), "null")
    }

    fun writeMac(mac: String?) {
        val editor = sharedPreferences.edit()
        editor.putString(context.getString(R.string.pref_user_MacAddress), mac)
        editor.apply()
    }

    fun readMac(): String {
        return sharedPreferences.getString(context.getString(R.string.pref_user_MacAddress), "")
    }

    init {
        sharedPreferences = context.getSharedPreferences(
            context.getString(R.string.pref_file),
            Context.MODE_PRIVATE
        )
    }
}
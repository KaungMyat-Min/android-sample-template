package me.kaungmyatmin.mytemplate.util

import android.content.Context

class PreferenceManager (private val context: Context, private val name: String = "default_pref") {

    fun getString(key: String, default: String? = null) = getPref().getString(key, default)
    fun getStringSet(key: String, default: MutableSet<String>? = null) =
        getPref().getStringSet(key, default)

    fun getInt(key: String, default: Int = -1) = getPref().getInt(key, default)
    fun getLong(key: String, default: Long = -1L) = getPref().getLong(key, default)
    fun getFloat(key: String, default: Float = -1f) = getPref().getFloat(key, default)
    fun getBoolean(key: String, default: Boolean = false) = getPref().getBoolean(key, default)


    fun putString(key: String, value: String?) = getEdit().putString(key, value).commit()
    fun putStringSet(key: String, value: MutableSet<String>?) =
        getEdit().putStringSet(key, value).commit()

    fun putInt(key: String, value: Int) = getEdit().putInt(key, value).commit()
    fun putLong(key: String, value: Long) = getEdit().putLong(key, value).commit()
    fun putFloat(key: String, value: Float) = getEdit().putFloat(key, value).commit()
    fun putBoolean(key: String, value: Boolean) = getEdit().putBoolean(key, value).commit()

    private fun getPref() = context.getSharedPreferences(name, Context.MODE_PRIVATE)
    private fun getEdit() = getPref().edit()
}
package com.zhaku.detailing.Profile

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.zhaku.detailing.ItemLists.ItemListActivity
import com.zhaku.detailing.Login.LoginActivity
import com.zhaku.detailing.R
import com.zhaku.detailing.backendApiService


class ProfileFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    val TAG = "ProfileFragment"
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("oncreate", TAG)

        val rootView = inflater.inflate(R.layout.profile_view, container, false)
        val edit : TextView = rootView.findViewById(R.id.profile_edit_button)
        edit.setOnClickListener{
            val intent = Intent(rootView.context, EditProfile::class.java)
            startActivity(intent)
        }


        return rootView
    }
    fun getUserInfo() {
        val apiService = backendApiService.createWithRx()

    }
}
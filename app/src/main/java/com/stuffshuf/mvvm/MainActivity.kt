package com.stuffshuf.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.stuffshuf.mvvm.ViewModels.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class MainActivity : AppCompatActivity() {

    val mainActivityViewMode by lazy {
        ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityViewMode.getUser().observe(this, Observer {user ->
            //            imageView.
            textView.text = user.name
            textView2.text = user.userName

        })


        val retrofit=Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("")
            .build();


        val service=retrofit.create(RetrofitInterface::class.java)
        service.dataInput().enqueue(retrofitCallback{throwable, response ->

            response?.let {

                if (it.isSuccessful)
                {


                }
            }


        })
    }
}
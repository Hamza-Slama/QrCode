package com.hamza.testqr


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import android.widget.Button
import kotlinx.android.extensions.CacheImplementation
import kotlinx.android.extensions.ContainerOptions
import kotlinx.android.parcel.Parcelize
import kotlinx.android.synthetic.main.activity_main.*

@ContainerOptions(CacheImplementation.SPARSE_ARRAY)
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gen.setOnClickListener {
            val gIntent = Intent(this@MainActivity, GeneratorActivity::class.java)
            startActivity(gIntent)
        }
        scan.setOnClickListener {
            val rIntent = Intent(this@MainActivity, ReaderActivity::class.java)
            startActivity(rIntent)
        }
    }



//    @Parcelize
//    class Model(val title: String, val amount: Int) : Parcelable
//val intent = Intent(this, DetailActivity::class.java)
//    intent.putExtra(DetailActivity.EXTRA, model)
//    startActivity(intent)



//    1
//    val model: Model = intent.getParcelableExtra(EXTRA)
}

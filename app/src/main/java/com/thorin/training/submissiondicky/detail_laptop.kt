package com.thorin.training.submissiondicky

import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class detail_laptop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.laptop_detail)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail Laptop"
        actionbar.setDisplayHomeAsUpEnabled(true)


        val tvType: TextView = findViewById(R.id.tv_set_name)
        val tvDetail: TextView = findViewById(R.id.tv_set_detail)
        val tvImg: ImageView = findViewById(R.id.tv_set_image)

        val tType = intent.getStringExtra(EXTRA_NAME)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tImage = intent.getIntExtra(EXTRA_PHOTO,0)

        Glide.with(this)
            .load(tImage)
            .apply(RequestOptions())
            .into(tvImg)
        tvType.text = tType
        tvDetail.text = tDetail
    }
    companion object {

        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"


    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
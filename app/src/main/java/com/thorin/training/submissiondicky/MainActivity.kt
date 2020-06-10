package com.thorin.training.submissiondicky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvLaptops: RecyclerView
    private var list: ArrayList<Laptop> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title= "Home"
        rvLaptops = findViewById(R.id.rv_laptop)
        rvLaptops.setHasFixedSize(true)
        list.addAll(LaptopData.listData)
        showRecyclerList()
    }
    private fun showRecyclerList(){
        rvLaptops.layoutManager = LinearLayoutManager(this)
        val listLaptopAdapter = ListLaptopAdapter(list)
        rvLaptops.adapter = listLaptopAdapter
    }
    private fun showAboutPage() {
        val abpage = Intent(this@MainActivity, About::class.java)
        startActivity(abpage)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
    menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        modeKage(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    fun modeKage(selectedMode: Int) {
        when (selectedMode ) {
            R.id.action_about -> {
                showAboutPage()
            }
        }
    }
}
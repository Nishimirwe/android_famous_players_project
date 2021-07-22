package com.hellofriendz.softwaretools

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.hellofriendz.softwaretools.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            replace(R.id.frame_layout_id,AdditionalFragment())
        }

        binding.bottomNavigationBarId.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        if(item.itemId==R.id.premier_league)
        {
            onEnglandClicked()
            return true
        }
        else if(item.itemId==R.id.la_liga)
        {
            onSpainClicked()
            return true
        }
        else if(item.itemId==R.id.league_un)
        {
            onFranceClicked()
            return true
        }
        else
        {
            return false
        }
    }

//    //the following function is where we I have controlled the clicked navigation.
//    //  Look at the way I have just controlled it and remember it next time. This is so important.
//    override fun onNavigationItemSelected(item: MenuItem) : Boolean{

    private fun onEnglandClicked()
    {
        supportFragmentManager.commit {
            replace(R.id.frame_layout_id,AdditionalFragment())
        }
    }

    private fun onSpainClicked()
    {
        supportFragmentManager.commit {
            replace(R.id.frame_layout_id,FrontEndFragment())
        }
    }

    private fun onFranceClicked()
    {
        supportFragmentManager.commit {
            replace(R.id.frame_layout_id,LeagueUnFragment())
        }
    }
}
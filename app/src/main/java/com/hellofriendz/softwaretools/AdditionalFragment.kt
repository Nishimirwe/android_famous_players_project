package com.hellofriendz.softwaretools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.hellofriendz.softwaretools.databinding.ActivityAdditionalBinding
import java.util.ArrayList
import android.content.Intent as Intent1
import android.widget.Toast.makeText as toastMakeText

class AdditionalFragment : Fragment() {
    private lateinit var binding: ActivityAdditionalBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= ActivityAdditionalBinding.inflate(inflater,container,false)
        return binding.root
    }

    // England

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val players:ArrayList<PlayersClass> = arrayListOf(
            PlayersClass("Bruno Fernandez", 25,"Portugal",R.drawable.bruno_player),
            PlayersClass("Ryad Mahrez", 24,"Algeria",R.drawable.mahrez_players),
            PlayersClass("Kevin De Bruyne", 28,"Belgium",R.drawable.de_bruyne_player),
            PlayersClass("NGolo Kante", 28,"France",R.drawable.kane_player),
            PlayersClass("Harry Kane", 29,"England",R.drawable.kane_player),
            PlayersClass("Paul Pogba", 28,"France",R.drawable.pogba_player),
            PlayersClass("Hackim Ziyech", 23,"Morocco",R.drawable.ziyech_player),
            PlayersClass("Pierre Emenick Aubemyang", 26,"Gabon",R.drawable.aube_player),
            PlayersClass("Marcus Rashfoard", 22,"England",R.drawable.rashy_player),
        )

        val recycler=binding.playersRecyclerViewId
        var adapter=PlayersAdapterClass()
        adapter.setList(players)
        recycler.adapter=adapter

    }
}
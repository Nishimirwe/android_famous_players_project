package com.hellofriendz.softwaretools

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hellofriendz.softwaretools.databinding.FragmentLeagueUnBinding

class LeagueUnFragment : Fragment() {

    private lateinit var binding: FragmentLeagueUnBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // define binding
        binding= FragmentLeagueUnBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val players:ArrayList<PlayersClass> = arrayListOf(
            PlayersClass("Kylan Mbape",20,"France",R.drawable.mbape_player),
            PlayersClass("Neymar Jr",26,"Brazil",R.drawable.neymar_player),
            PlayersClass("Keylor Navas",32,"Costa Rica",R.drawable.navas_player),
            PlayersClass("Presnel Kimpembe",25,"France",R.drawable.kipembe_player),
            PlayersClass("Angel Di Maria",33,"Argentine",R.drawable.dimaria_player),
            PlayersClass("Dimitri Payet",34,"France",R.drawable.payet_player)
        )

        val recycler=binding.playersRecyclerViewId

        val adapter=PlayersAdapterClass()
        adapter.setList((players))
        recycler.adapter=adapter
    }

}
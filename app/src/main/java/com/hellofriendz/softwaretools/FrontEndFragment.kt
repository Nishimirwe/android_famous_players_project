package com.hellofriendz.softwaretools

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import com.hellofriendz.softwaretools.databinding.ActivityMainBinding
import com.hellofriendz.softwaretools.databinding.FragmentFrontEndBinding

class FrontEndFragment : Fragment() {

    private lateinit var binding: FragmentFrontEndBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFrontEndBinding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    // Spain

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val players:ArrayList<PlayersClass> = arrayListOf(
            PlayersClass("Lionel Messi",34,"Argentine",R.drawable.messi_player),
            PlayersClass("Luis Suarez",36,"Uruguay",R.drawable.suarez_player),
            PlayersClass("Toni Kroos",35,"Germany",R.drawable.kroos_player),
            PlayersClass("Sergio Bousquet",37,"Spain",R.drawable.bousquet_player),
            PlayersClass("Joao Felix",19,"Portugal",R.drawable.joao_player),
            PlayersClass("Gerard Pique",35,"Spain",R.drawable.pique_player),
            PlayersClass("Jan Oblack",34,"Slovenia",R.drawable.oblak_players)
            )

        val recycler=binding.playersRecyclerViewId

        val adapter=PlayersAdapterClass()
        adapter.setList((players))
        recycler.adapter=adapter
    }
}
package com.hellofriendz.softwaretools

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class PlayersAdapterClass : RecyclerView.Adapter<PlayersAdapterClass.PlayersViewHolder>() {
    private lateinit var players: ArrayList<PlayersClass>
    private lateinit var v:View
    class PlayersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        private var image:ImageView=itemView.findViewById(R.id.player_image_id)
        private var name:TextView=itemView.findViewById(R.id.player_name_id)
        private var nationality:TextView=itemView.findViewById(R.id.player_nationality_id)
        private var ages:TextView=itemView.findViewById(R.id.players_ages_id)
        fun bind(pc:PlayersClass)
        {
            image.setImageResource(pc.getImage())
            name.text=pc.getName()
            nationality.text=pc.getNationality()
            ages.text="Ages:  ${pc.getAges()}"
        }
    }

    fun setList(list:ArrayList<PlayersClass>)
    {
        players=list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayersViewHolder {
        v = LayoutInflater.from(parent.context)
            .inflate(R.layout.united_manchester_players_card_view, parent, false)
        return PlayersViewHolder(v)
    }

    override fun onBindViewHolder(holder: PlayersViewHolder, position: Int) {
        holder.bind(players[position])
    }

    override fun getItemCount(): Int {
        return players.size
    }
}
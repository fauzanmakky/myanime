package com.fauzan.myanime.presentation.anime_list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.fauzan.myanime.R
import com.fauzan.myanime.databinding.ItemAnimeBinding
import com.fauzan.myanime.domain.model.Anime

class AnimeAdapter(
    private val onItemClick: (Anime) -> Unit,
) : PagingDataAdapter<Anime, AnimeAdapter.AnimeViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        val binding = ItemAnimeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        val anime = getItem(position) ?: return
        holder.bind(anime)
    }

    inner class AnimeViewHolder(private val binding: ItemAnimeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(anime: Anime) {
            with(binding) {
                ivPoster.load(anime.imageUrl) {
                    crossfade(true)
                    placeholder(R.drawable.ic_launcher_foreground)
                    error(R.drawable.ic_launcher_foreground)
                }
                tvTitle.text = anime.title
                tvScore.text = itemView.context.getString(R.string.score_format, anime.score ?: 0.0)
                tvRank.text = itemView.context.getString(R.string.rank_format, anime.rank ?: 0)
                tvEpisodes.text = itemView.context.getString(
                    R.string.episodes_format,
                    anime.episodes?.toString() ?: "?"
                )
                tvStatus.text = anime.status ?: "-"
                root.setOnClickListener { onItemClick(anime) }
            }
        }
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Anime>() {
            override fun areItemsTheSame(oldItem: Anime, newItem: Anime) =
                oldItem.malId == newItem.malId

            override fun areContentsTheSame(oldItem: Anime, newItem: Anime) =
                oldItem == newItem
        }
    }
}

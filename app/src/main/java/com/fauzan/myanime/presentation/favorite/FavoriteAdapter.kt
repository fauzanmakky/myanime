package com.fauzan.myanime.presentation.favorite

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.fauzan.myanime.R
import com.fauzan.myanime.databinding.ItemFavoriteAnimeBinding
import com.fauzan.myanime.domain.model.Anime

class FavoriteAdapter(
    private val onItemClick: (Anime) -> Unit,
    private val onRemoveClick: (Int) -> Unit,
) : ListAdapter<Anime, FavoriteAdapter.FavoriteViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteViewHolder {
        val binding = ItemFavoriteAnimeBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return FavoriteViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FavoriteViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class FavoriteViewHolder(private val binding: ItemFavoriteAnimeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(anime: Anime) {
            with(binding) {
                ivPoster.load(anime.imageUrl) {
                    crossfade(true)
                    placeholder(R.drawable.ic_launcher_foreground)
                }
                tvTitle.text = anime.title
                tvScore.text = itemView.context.getString(R.string.score_format, anime.score ?: 0.0)
                tvRank.text = itemView.context.getString(R.string.rank_format, anime.rank ?: 0)
                tvStatus.text = anime.status ?: "-"
                btnRemove.setOnClickListener { onRemoveClick(anime.malId) }
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

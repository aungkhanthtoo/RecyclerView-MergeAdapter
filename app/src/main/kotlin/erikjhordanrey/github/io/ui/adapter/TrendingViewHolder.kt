package erikjhordanrey.github.io.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import erikjhordanrey.github.io.databinding.ItemTrendingBinding
import erikjhordanrey.github.io.domain.Trending

class TrendingViewHolder(private val binding: ItemTrendingBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(trending: Trending, onTrendingListener: ((Trending) -> Unit)?) = trending.run {
        binding.idTextView.text = id
        binding.titleTextView.text = title
        binding.viewsTextView.text = viewsCounter
        itemView.setOnClickListener { onTrendingListener?.invoke(this) }
    }
}

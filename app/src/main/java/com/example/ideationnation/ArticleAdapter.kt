

package  com.example.ideationnation
import com.example.ideationnation.Idea
import com.example.ideationnation.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArticleAdapter : RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {
    private var articles = emptyList<Idea>()

    inner class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(article:Idea) {
            itemView.findViewById<TextView>(R.id.title_text_view).text = article.title

            itemView.findViewById<TextView>(R.id.contentent_text_view).text = article.myIdea
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.article_item, parent, false)
        return ArticleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = articles[position]
        holder.bind(article)
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    fun setArticles(articles: List<Idea>) {
        this.articles = articles
        notifyDataSetChanged()
    }
}
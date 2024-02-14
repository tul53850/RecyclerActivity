package edu.temple.simplerecyclerview

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {

    private val num = Array(100){i -> (i + 1) }

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {
        val txtView = textView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(TextView(parent.context).apply {layoutParams = ViewGroup.LayoutParams(300,300)})
    }

    override fun getItemCount(): Int {
        return num.size
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.setText(num[position])
    }


}
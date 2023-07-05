package com.example.mviarchitecture.ui.main.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mviarchitecture.R
import com.example.mviarchitecture.data.model.User
import com.example.mviarchitecture.databinding.ItemLayoutBinding

//import kotlinx.android.synthetic.main.item_layout.view.*

class MainAdapter(
    private val users: ArrayList<User>
) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {


    lateinit var binding: ItemLayoutBinding

    inner class DataViewHolder(var itemView: ItemLayoutBinding) : RecyclerView.ViewHolder(itemView.root) {

        fun bind(user: User,) {
            binding.textViewUserName.text = user.name
            binding.textViewUserEmail.text = user.email
            Glide.with(binding.imageViewAvatar.context)
                .load(user.avatar)
                .into(binding.imageViewAvatar)
        }

    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        binding=ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        var view=DataViewHolder(binding)

        return view;
}

        /*DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout, parent,
                false
            )
        )*/



    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {

        holder.bind(users[position])


    }
    fun addData(list: List<User>) {
        users.addAll(list)
    }

}
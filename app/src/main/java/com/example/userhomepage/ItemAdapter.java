package com.example.userhomepage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    List<Item> items;

    public ItemAdapter(List<Item> items) {
        this.items = items;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView1;
        TextView title;
        ImageView imageView2;
        TextView likes;
        TextView stars;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1 = itemView.findViewById(R.id.img);
            title = itemView.findViewById(R.id.tv_title);
            imageView2 = itemView.findViewById(R.id.img_portrait);
            likes = itemView.findViewById(R.id.num_like);
            stars = itemView.findViewById(R.id.num_star);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = items.get(position);
        holder.imageView1.setImageResource(item.getImageRes());
        holder.title.setText(item.getTitle());
        holder.imageView2.setImageResource(item.getImgRes());
        holder.likes.setText(item.getLikes());
        holder.stars.setText(item.getStars());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}

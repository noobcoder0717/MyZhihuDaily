package com.example.myzhihudaily;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder>{
    List<News> newsList=new ArrayList<News>();
    public NewsAdapter(List<News> list){
        newsList=list;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView newsPhoto;
        TextView newsTitle;
        ViewHolder(View view){
            super(view);
            newsPhoto=view.findViewById(R.id.news_photo);
            newsTitle=view.findViewById(R.id.news_title);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        News news=newsList.get(position);
        holder.newsTitle.setText(news.getTitle());
        holder.newsPhoto.setBackgroundResource(news.getPhoto());
    }
    @Override
    public int getItemCount(){
        return newsList.size();
    }
}

package com.example.fileupload;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class UploadedAdapter extends RecyclerView.Adapter<UploadedAdapter.ViewHolder> {
    private ArrayList<String> UploadedList;

    public UploadedAdapter(ArrayList<String> UploadedList, Context context) {
        this.UploadedList = UploadedList;
        this.context = context;
    }

    private Context context;

    @NonNull
    @Override
    public UploadedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UploadedAdapter.ViewHolder holder, int position) {
        // loading the images from the position
        Glide.with(holder.itemView.getContext()).load(UploadedList.get(position)).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return UploadedList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.item);
        }
    }
}

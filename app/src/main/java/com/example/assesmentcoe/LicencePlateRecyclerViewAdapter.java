package com.example.assesmentcoe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LicencePlateRecyclerViewAdapter extends RecyclerView.Adapter<LicencePlateRecyclerViewAdapter.ViewHolder> {

    private final List<String> data;
    private final OnItemClickListener listener; // Add an interface for item click handling

    public LicencePlateRecyclerViewAdapter(List<String> data, OnItemClickListener listener) {
        this.data = data;
        this.listener = listener;
    }

    // Define the interface
    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.licenceplate_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.textView.setText(data.get(position));

        // Set click listener for the ImageView
        holder.deleteImageView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void simulateItemClick(int position) {
        if (listener != null) {
            listener.onItemClick(position);
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView deleteImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_LicencePlate_Item);
            deleteImageView = itemView.findViewById(R.id.imgv_delete); // Add this line
        }
    }
}


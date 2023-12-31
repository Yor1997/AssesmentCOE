package com.example.assesmentcoe.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assesmentcoe.R;

import java.util.List;

public class LicencePlateRecyclerViewAdapter extends RecyclerView.Adapter<LicencePlateRecyclerViewAdapter.ViewHolder> {

    private final List<String> data;
    private final OnItemClickListener listener;

    public LicencePlateRecyclerViewAdapter(List<String> data, OnItemClickListener listener) {
        this.data = data;
        this.listener = listener;
    }

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

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView deleteImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_LicencePlate_Item);
            deleteImageView = itemView.findViewById(R.id.imgv_delete);
        }
    }
}


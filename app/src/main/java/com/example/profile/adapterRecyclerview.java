package com.example.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapterRecyclerview extends RecyclerView.Adapter<adapterRecyclerview.ViewHolder> {

    private ArrayList<itemModel> dataItem;
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textHead;
        TextView textSubHead;
        ImageView imageIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textHead = itemView.findViewById(R.id.textTitle);
            textSubHead = itemView.findViewById(R.id.textSubtitle);
            imageIcon = itemView.findViewById(R.id.imageList);
        }
    }

    adapterRecyclerview(ArrayList<itemModel> dataItem) {
        this.dataItem = dataItem;
    }

    @NonNull
    @Override
    public adapterRecyclerview.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listprofile, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterRecyclerview.ViewHolder holder, int position) {

        TextView TextHead = holder.textHead;
        TextView TextSubHead = holder.textSubHead;
        ImageView ImageIcon = holder.imageIcon;

        TextHead.setText(dataItem.get(position).getName());
        TextSubHead.setText(dataItem.get(position).getType());
        ImageIcon.setImageResource(dataItem.get(position).getImage());

    }

    @Override
    public int getItemCount() {

        return dataItem.size();
    }


}

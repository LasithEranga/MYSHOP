package com.example.lasith.myshop.adpater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.lasith.myshop.R;
import com.example.lasith.myshop.model.DiscountedProducts;

import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DiscountedProductAdapter extends RecyclerView.Adapter<DiscountedProductAdapter.DiscountProductViewHolder> {
    Context context;

    List<DiscountedProducts> discountedProductsList;
    public DiscountedProductAdapter(Context context, List<DiscountedProducts> datalist) {
        discountedProductsList = datalist;
        this.context = context;
    }

    @NonNull

    @Override
    public DiscountProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.discounted_row_items, parent , false);
        return new DiscountProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiscountProductViewHolder holder, int position) {
        holder.discountImageView.setImageResource(discountedProductsList.get(position).getImgUrl());
    }

    @Override
    public int getItemCount() {
       return discountedProductsList.size();
    }



    public static class DiscountProductViewHolder extends RecyclerView.ViewHolder{
        ImageView discountImageView;
        public DiscountProductViewHolder(@NonNull View itemView) {
            super(itemView);
            discountImageView = itemView.findViewById(R.id.catgoryImageView);
        }
    }
}

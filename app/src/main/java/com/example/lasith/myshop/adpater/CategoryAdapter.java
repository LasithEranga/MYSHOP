package com.example.lasith.myshop.adpater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.example.lasith.myshop.MainActivity;
import com.example.lasith.myshop.R;
import com.example.lasith.myshop.model.Category;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    Context context;
    List<Category> categoryList;

    public CategoryAdapter(Context context, List<Category> categoryDataList) {
        this.context = context;
        categoryList = categoryDataList;
    }

    @NonNull

    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.category_row_items, parent , false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  CategoryAdapter.CategoryViewHolder holder, int position) {
        holder.categoryImageView.setImageResource(categoryList.get(position).getImgUrl());

    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public  static  class  CategoryViewHolder extends  RecyclerView.ViewHolder{
        ImageView categoryImageView;
        public CategoryViewHolder(View itemView) {
            super(itemView);

            categoryImageView = itemView.findViewById(R.id.catgoryImageView);
        }
    }

}
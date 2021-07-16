package com.example.lasith.myshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lasith.myshop.adpater.CategoryAdapter;
import com.example.lasith.myshop.adpater.DiscountedProductAdapter;
import com.example.lasith.myshop.model.DiscountedProducts;
import com.example.lasith.myshop.model.Category;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView discountRecyclerView , categoryRecyclerView;
    DiscountedProductAdapter discountedProductAdapter;
    List<DiscountedProducts> discountedProductsList;
    CategoryAdapter categoryAdapter;
    List<Category> categoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        discountRecyclerView = findViewById(R.id.discountedRecycler);
        categoryRecyclerView = findViewById(R.id.categoryRecycler);
        //Adding data to model
        discountedProductsList = new ArrayList<>();
        discountedProductsList.add(new DiscountedProducts(1, R.drawable.image_6));
        discountedProductsList.add(new DiscountedProducts(2, R.drawable.image_6));
        discountedProductsList.add(new DiscountedProducts(3, R.drawable.image_6));
        discountedProductsList.add(new DiscountedProducts(4, R.drawable.image_6));
        discountedProductsList.add(new DiscountedProducts(5, R.drawable.image_6));
        discountedProductsList.add(new DiscountedProducts(6, R.drawable.image_6));
        setDiscountedRecycler(discountedProductsList);

        //Adding data to model
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, R.drawable.image_6));
        categoryList.add(new Category(1, R.drawable.image_6));
        categoryList.add(new Category(1, R.drawable.image_6));
        categoryList.add(new Category(1, R.drawable.image_6));
        setCategoryRecyclerView(categoryList);
    }

    private void setDiscountedRecycler(List<DiscountedProducts> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductAdapter = new DiscountedProductAdapter(this, dataList);
        discountRecyclerView.setAdapter(discountedProductAdapter);
    }

    private void setCategoryRecyclerView(List<Category> categoryDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        categoryRecyclerView.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this, categoryDataList);
        categoryRecyclerView.setAdapter(categoryAdapter);
    }
}
package com.notepoint.dgsetdemo.home.products;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.notepoint.dgsetdemo.R;

import java.util.ArrayList;

public class ProductRecyclerAdapter extends RecyclerView.Adapter<ProductRecyclerAdapter.ProductHolder> {

    ArrayList<ProductModel> productList;

    public ProductRecyclerAdapter(ArrayList<ProductModel> productList) {
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_product_layout,parent,false);
        return new ProductHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {

        ProductModel product = productList.get(position);
        holder.productName.setText(product.getProductName());
        holder.productPrice.setText(String.format("Rs.%s", product.getProductPrice()));
        holder.productImage.setImageResource(product.getProductImageId());

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ProductHolder extends RecyclerView.ViewHolder {
        ImageView productImage;
        TextView productName, productPrice;
        public ProductHolder(@NonNull View itemView) {
            super(itemView);

            productImage = itemView.findViewById(R.id.product_image_single);
            productName = itemView.findViewById(R.id.product_name_text_view);
            productPrice = itemView.findViewById(R.id.product_price_text_view);

        }
    }
}

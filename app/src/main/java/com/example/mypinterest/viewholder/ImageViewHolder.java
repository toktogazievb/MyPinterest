package com.example.mypinterest.viewholder;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mypinterest.ItemImage;
import com.example.mypinterest.databinding.ItemImageBinding;

public class ImageViewHolder extends RecyclerView.ViewHolder {

    public ItemImageBinding viewBinding;

    public ImageViewHolder(ItemImageBinding viewBinding) {
        super(viewBinding.getRoot());
        this.viewBinding = viewBinding;
    }

    public void onBind(ItemImage image){
        Glide.with(itemView.getContext()).load(image.getImage()).into(viewBinding.ivImage);
    }

}

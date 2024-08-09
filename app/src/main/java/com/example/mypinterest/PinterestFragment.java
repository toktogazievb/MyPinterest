package com.example.mypinterest;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mypinterest.adapter.ImageAdapter;
import com.example.mypinterest.databinding.FragmentPinterestBinding;

import java.util.ArrayList;


public class PinterestFragment extends Fragment {

    public FragmentPinterestBinding viewBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewBinding = FragmentPinterestBinding.inflate(getLayoutInflater());
        return viewBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<ItemImage> images = new ArrayList<>();

        ItemImage image1 = new ItemImage("https://wallpapers.com/images/hd/1080x1920-ugd930ckdcujq44s.jpg");
        ItemImage image2 = new ItemImage("https://mrwallpaper.com/images/hd/strikingly-beautiful-orange-and-yellow-sunset-90lf8o55k3hi51kk.jpg");
        ItemImage image3 = new ItemImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCx1LIhclG1259k8O7apJhWVyFMAA4S79rZA&s");
        ItemImage image4 = new ItemImage("https://wallpapers.com/images/hd/1080x1920-7q3bv996d3wgdicn.jpg");
        ItemImage image5 = new ItemImage("https://images.wallpapersden.com/image/download/huawei-4k-stock-abstract_a2toaGuUmZqaraWkpJRmZW1lrWZuZ2U.jpg");
        ItemImage image6 = new ItemImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTohF__jGjKagEU6Qagp3haFiQ-dizFN2gpfw&s");
        ItemImage image7 = new ItemImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-EeE6a7Fgjhs2gR10HyByLoBqbNpv8EqrPQ&s");
        ItemImage image8 = new ItemImage("https://preview.redd.it/xgd5klircz911.jpg?width=1080&crop=smart&auto=webp&s=2a218ca135053d577c6f898bf9433a56c1bd818c");
        ItemImage image9 = new ItemImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTY4g-7j4tbtsOwEO7hfa_F9Bl1sc6GAD5cUQ&s");

        images.add(image1);
        images.add(image2);
        images.add(image3);
        images.add(image4);
        images.add(image5);
        images.add(image6);
        images.add(image7);
        images.add(image8);
        images.add(image9);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        viewBinding.myRv.setLayoutManager(staggeredGridLayoutManager);

        ImageAdapter imageAdapter = new ImageAdapter(images);
        viewBinding.myRv.setAdapter(imageAdapter);
    }
}
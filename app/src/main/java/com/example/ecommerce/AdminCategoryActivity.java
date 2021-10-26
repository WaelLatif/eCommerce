package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView tShirts, sportsTShirt, femaleDresses, sweather,
            glasses, Bags, hats, shoess,
            headPhones, laptops, watches, mobiles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        tShirts = findViewById(R.id.tShirts);
        sportsTShirt = findViewById(R.id.sportsTShirt);
        femaleDresses = findViewById(R.id.femaleDresses);
        sweather = findViewById(R.id.sweather);

        glasses = findViewById(R.id.glasses);
        Bags = findViewById(R.id.Bags);
        hats = findViewById(R.id.hats);
        shoess = findViewById(R.id.shoess);

        headPhones = findViewById(R.id.headPhones);
        laptops = findViewById(R.id.laptops);
        watches = findViewById(R.id.watches);
        mobiles = findViewById(R.id.mobiles);

        tShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                in.putExtra("category", "tShirts");
                startActivity(in);
            }
        });
        sportsTShirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                in.putExtra("category", "sportsTShirt");
                startActivity(in);
            }
        });
        femaleDresses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                in.putExtra("category", "femaleDresses");
                startActivity(in);
            }
        });

        sweather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                in.putExtra("category", "sweather");
                startActivity(in);
            }
        });
        glasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                in.putExtra("category", "glasses");
                startActivity(in);
            }
        });
        Bags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                in.putExtra("category", "Bags");
                startActivity(in);
            }
        });
        hats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                in.putExtra("category", "hats");
                startActivity(in);
            }
        });

        shoess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                in.putExtra("category", "shoess");
                startActivity(in);
            }
        });
        headPhones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                in.putExtra("category", "headPhones");
                startActivity(in);
            }
        });

        laptops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                in.putExtra("category", "laptops");
                startActivity(in);
            }
        });
        watches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                in.putExtra("category", "watches");
                startActivity(in);
            }
        });
        mobiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                in.putExtra("category", "mobiles");
                startActivity(in);
            }
        });

    }
}
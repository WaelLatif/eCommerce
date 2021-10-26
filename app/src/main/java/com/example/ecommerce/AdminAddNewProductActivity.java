package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class AdminAddNewProductActivity extends AppCompatActivity {

    private Button addNewProductBtn;
    private EditText inputProductName, inputProductDescription, inputProductPrice ;
    private ImageView productImage;
    private String CategoryName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add_new_product);

        CategoryName = getIntent().getStringExtra("category");

        addNewProductBtn =findViewById(R.id.addProductBtn);
        productImage = findViewById(R.id.selectProductImage);
        inputProductName=findViewById(R.id.productName);
        inputProductDescription=findViewById(R.id.productDescription);
        inputProductPrice=findViewById(R.id.productPrice);


    }

}
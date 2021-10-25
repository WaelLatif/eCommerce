package com.example.ecommerce;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.concurrent.Callable;

public class RegisterActivity extends AppCompatActivity {

    private Button createAccountBtn;
    private EditText inputName, inputPhoneNo, inputPassword;
    private ProgressDialog loadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        createAccountBtn = findViewById(R.id.registerBtn);
        inputName = findViewById(R.id.registerUserName);
        inputPhoneNo = findViewById(R.id.registerPhoneNo);
        inputPassword = findViewById(R.id.registerPassword);

        loadingBar = new ProgressDialog(this);


        createAccountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAccount();
            }
        });

    }

    private void createAccount() {
        String name = inputName.getText().toString();
        String phone = inputPhoneNo.getText().toString();
        String password = inputPassword.getText().toString();

        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(phone) || TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Please fill all data...", Toast.LENGTH_SHORT).show();
        }
        loadingBar.setTitle("Creating Account");
        loadingBar.setMessage("please wait...");
        loadingBar.setCanceledOnTouchOutside(false);
        loadingBar.show();

        validatePhoneNumber(name, phone, password);
    }

    private void validatePhoneNumber(String name, String phone, String password) {
        final DatabaseReference RootRef;

        RootRef = FirebaseDatabase.getInstance().getReference();

        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (!(snapshot.child("User").child(phone).exists())) {
                    HashMap<String, Object> userDataMap = new HashMap<>();
                    userDataMap.put("Phone",phone);
                    userDataMap.put("Password",password);
                    userDataMap.put("Name",name);

                    RootRef.child("User").child(phone).updateChildren(userDataMap)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(RegisterActivity.this, "Registration Completed ", Toast.LENGTH_SHORT).show();
                                loadingBar.dismiss();
                                Intent in = new Intent(RegisterActivity.this,LoginActivity.class);
                                startActivity(in);
                            }else{
                                loadingBar.dismiss();
                                Toast.makeText(RegisterActivity.this, "Error, please try again", Toast.LENGTH_SHORT).show();
                            }

                        }
                    });

                } else {
                    Toast.makeText(RegisterActivity.this, "this Phone No.' " + phone + " ' already exist.", Toast.LENGTH_SHORT).show();
                    loadingBar.dismiss();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}
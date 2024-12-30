package com.example.codingapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.codingapp.request.User;
import com.example.codingapp.response.CommonResponse;
import com.example.codingapp.response.ErrorResponse;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Sign extends AppCompatActivity {

    private EditText nameField, emailField, phoneField, passwordField, schoolField, standardField;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        nameField = findViewById(R.id.name);
        emailField = findViewById(R.id.editEmail);
        phoneField = findViewById(R.id.editPhone);
        passwordField = findViewById(R.id.editPassword);
        schoolField = findViewById(R.id.school);
        standardField = findViewById(R.id.standard);
        registerButton = findViewById(R.id.btRegister);

        registerButton.setOnClickListener(v -> registerUser());
    }

    private void registerUser() {
        String name = nameField.getText().toString().trim();
        String email = emailField.getText().toString().trim();
        String phone = phoneField.getText().toString().trim();
        String password = passwordField.getText().toString().trim();
        String schoolname = schoolField.getText().toString().trim();
        String standard = standardField.getText().toString().trim();

        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "All fields are required", Toast.LENGTH_SHORT).show();
            return;
        }

        User user = new User(name, email, Long.parseLong(phone), password, schoolname, standard);

       Call<CommonResponse> signin =RetrofitClient.makeApi().signin(user);
       signin.enqueue(new Callback<CommonResponse>() {
           @Override
           public void onResponse(Call<CommonResponse> call, Response<CommonResponse> response) {
               if(response.isSuccessful()) {
                   finish();
                   Toast.makeText(Sign.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
               }else {
                   try {
                       ErrorResponse errorResponse = new Gson().fromJson(response.errorBody().string(), ErrorResponse.class);
                       Toast.makeText(Sign.this, errorResponse.getMessage(), Toast.LENGTH_SHORT).show();
                   } catch (Exception e) {
                       e.printStackTrace();
                       Toast.makeText(Sign.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                   }
               }
           }

           @Override
           public void onFailure(Call<CommonResponse> call, Throwable t) {
               Toast.makeText(Sign.this, t.getMessage(), Toast.LENGTH_SHORT).show();
           }
       });
    }
}

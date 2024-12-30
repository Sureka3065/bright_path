package com.example.codingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.codingapp.response.ErrorResponse;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {

    private EditText usernameField, passwordField;
    private AppCompatButton loginButton;
    private TextView createAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize views
        usernameField = findViewById(R.id.usernameField);
        passwordField = findViewById(R.id.passwordField);
        loginButton = findViewById(R.id.loginButton);
        createAccount = findViewById(R.id.account);

        // Handle login button click
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve input values
                String username = usernameField.getText().toString().trim();
                String password = passwordField.getText().toString().trim();

                // Validate inputs
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(Login.this, "Username or Password cannot be empty", Toast.LENGTH_SHORT).show();
                } else {
                    // Perform login API call
                    loginUser(username, password);
                }
            }
        });

        // Handle "Create Account" text click
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Sign (Create Account) activity
                Intent intent = new Intent(Login.this, Sign.class);
                startActivity(intent);
            }
        });
    }

    private void loginUser(String username, String password) {
        // Create Retrofit instance and API interface
        Api api = RetrofitClient.getClient().create(Api.class);

        // Create the login request object
        LoginRequest loginRequest = new LoginRequest(username, password);

        // Make the API call
        Call<LoginResponse> call = api.loginUser(loginRequest);

        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful()) {
                    LoginResponse loginResponse = response.body();
                        startActivity(response.message());
                        // Optional: Close the Login screen to prevent going back

                } else {
                    // Handle unsuccessful responses
                    try {
                        ErrorResponse errorResponse = new Gson().fromJson(response.errorBody().string(), ErrorResponse.class);
                        Toast.makeText(Login.this, errorResponse.getMessage(), Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {

                        e.printStackTrace();
                        Toast.makeText(Login.this, "Unexpected error occurred", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                // Handle network or server failures
                Toast.makeText(Login.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void startActivity(String message){
        Toast.makeText(Login.this, "from "+message, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Login.this, Coding.class);
        startActivity(intent);
        finish();

    }
}

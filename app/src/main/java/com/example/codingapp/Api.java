package com.example.codingapp;

import com.example.codingapp.request.User;
import com.example.codingapp.response.CommonResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

// Define the API endpoint
public interface Api {

    @POST("student/login") // Replace with your API endpoint
    Call<LoginResponse> loginUser(@Body LoginRequest loginRequest);


    @POST("student/create_student")
    Call<CommonResponse> signin(@Body User user);

}

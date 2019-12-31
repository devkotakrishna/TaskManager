package com.krishna.taskmanager.API;

import android.telecom.Call;

import com.krishna.taskmanager.ServerResponse.SignupResponse;
import com.krishna.taskmanager.SignUpActivity;

public interface UserAPI {
    @POST("users/signup")
    Call<SignupResponse> registration (@Body Users users);

    @FormUrlEncoded
    @POST("users/login")
    Call<SignupResponse>checkUser(@Field("username") String username,@Field("String password"));


}

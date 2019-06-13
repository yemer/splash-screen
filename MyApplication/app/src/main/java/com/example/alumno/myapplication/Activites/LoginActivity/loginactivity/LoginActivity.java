package com.example.alumno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.alumno.myapplication.R;
import com.example.alumno.myapplication.models.User;

import java.util.ArrayList;

public class LoginActiviti extends AppCompatActivity {
    button btnLogin;
    EditText txtpasword;
    EditText txtUsuarioo;
    ArrayList<User> listaUsuarios = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        User user1 = new User();
        user1.setUsername("bicho");
        user1.setPassword("123456");
        User user 2 = new User();
        User.setUsername("Plaga");
        user1.setPassword("qwery");
        listaUsuarios.add(user);
        listaUsuarios.add(user1);
        btnLogin = (button)findViewById(R.id.btnStart);

        btnLogin.setOnClickListen;
    }
}

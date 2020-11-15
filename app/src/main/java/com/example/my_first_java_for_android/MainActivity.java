package com.example.my_first_java_for_android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnImg, register;
    private EditText ed_Name, ed_Email, ed_password, ed_rePassword;
    private CheckBox agree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btnImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Choose image", Toast.LENGTH_SHORT).show();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = ed_Name.getText().toString();
                String email = ed_Email.getText().toString();
                String password = ed_password.getText().toString();
                String rePassword = ed_rePassword.getText().toString();

                if (name.isEmpty() && email.isEmpty() && password.isEmpty() && rePassword.isEmpty() || !agree.isChecked()) { // .matches("")
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Right", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void init() {
        btnImg = findViewById(R.id.btnImg);
        register = findViewById(R.id.register);
        ed_Name = findViewById(R.id.ed_Name);
        ed_Email = findViewById(R.id.ed_Email);
        ed_password = findViewById(R.id.ed_password);
        ed_rePassword = findViewById(R.id.ed_password);
        agree = findViewById(R.id.agree);
    }
}
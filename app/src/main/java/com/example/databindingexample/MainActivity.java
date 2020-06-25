package com.example.databindingexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setXxx(new User());
        binding.setButtonAction(new MainActivity());

    }

    public void onMessage(View view,String strMsg)
    {
       Toast.makeText(view.getContext(),strMsg,Toast.LENGTH_LONG).show();
    }

}
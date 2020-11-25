package cl.sebastian.elclima;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import cl.sebastian.elclima.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setWeather(new DailyWeather("santiago","22/10/2020","","20","°c"));
    }
}
package cl.sebastian.elclima;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import cl.sebastian.elclima.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    DailyWeather dwTiempo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
        initView();
    }
    ///setContentView(R.layout.activity_main);
    // ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


    private void initData() {
        dwTiempo = new DailyWeather("viña", "24-11-2020", R.drawable.ic_sky_cloud,"12","°C");

        }

    private void initView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setWeather(dwTiempo);
    }

}


package com.shaikh.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.shaikh.databinding.data.User;
import com.shaikh.databinding.databinding.ActivityMainBinding;
import com.shaikh.databinding.handler.OnClickHandlerInterface;

public class MainActivity extends AppCompatActivity implements OnClickHandlerInterface {

    //declaring the Binding class
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // assign the layout file in binding class object
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        //set the data in data source class which reflect in layout file
        binding.setViewModel(new User("Aadan","Fadnavis","Software Engineer",10000));

        binding.setHandler(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this,"Button Clicked",Toast.LENGTH_SHORT).show();
    }
}

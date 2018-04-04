package com.dhaffaf.my_card;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView i = (ImageView)findViewById(R.id.aa);
        i.setImageResource(R.drawable.background_after);
        Button click = (Button)findViewById(R.id.click);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView i2 = (ImageView)findViewById(R.id.aa);
                i2.setImageResource(R.drawable.background_before);
            }
        });
    }
}

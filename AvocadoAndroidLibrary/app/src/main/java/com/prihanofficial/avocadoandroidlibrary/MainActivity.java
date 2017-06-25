package com.prihanofficial.avocadoandroidlibrary;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.prihanofficial.avocado.library.Avocado;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

private Button button;
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        button = (Button)findViewById(R.id.bt);
        imageView = (ImageView)findViewById(R.id.arrow);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

//                Avocado.setContext(getApplicationContext())
//                        .setText("Hello ..................................")
//                        .setTime("ss")
//                        .showAvocado();

                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.layout,
                        (ViewGroup) findViewById(R.id.d));

                TextView text = (TextView) layout.findViewById(R.id.text);
                text.setText("This is a custom toast");

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();


            }
        });

    }


}

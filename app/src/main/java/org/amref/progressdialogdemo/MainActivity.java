package org.amref.progressdialogdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    //Initialize Vaiable
    Button btnStart;
  ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Assing Varaible

    btnStart =  findViewById(R.id.start_button);
    btnStart.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //Initialize progress bar
            progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.show();
            progressDialog.setContentView(R.layout.progress_dialogue);
            progressDialog.getWindow().setBackgroundDrawableResource(
                    android.R.color.transparent
            );
        }
    });

    }

    @Override
    public void onBackPressed() {
        //dismiss progress dialoge
        progressDialog.dismiss();
    }
}
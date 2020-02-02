package com.juragancode.logindesign;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Test extends AppCompatActivity {


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        //menampilkan result
        TextView hasil = (TextView) findViewById(R.id.result);
        hasil.setText("WELCOME\n\n"+"Username : "+getIntent().getStringExtra("nama")+"\n"+"Password : "+getIntent().getStringExtra("pass")+"\n"+"Negara : "+getIntent().getStringExtra("negara")+"\n"+"No Hp : "+getIntent().getStringExtra("hp")+"\n"+"Gender : "+getIntent().getStringExtra("gender"));

        Button button = (Button) findViewById(R.id.back);

        // mendeteksi setiap button di klik
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //membuat intent
                Intent intent = new Intent(Test.this, MainActivity.class);

                //pindah activity
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        // do nothing because you don't want them to leave when it's pressed
    }
}


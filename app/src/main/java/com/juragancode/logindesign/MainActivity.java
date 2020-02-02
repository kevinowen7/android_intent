package com.juragancode.logindesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.click);

        // mendeteksi setiap button di klik
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            //mengambil data dari form
            EditText nama = (EditText) findViewById(R.id.username);
            EditText password = (EditText) findViewById(R.id.password);
            EditText negara = (EditText) findViewById(R.id.negara);
            EditText hp = (EditText) findViewById(R.id.no_hp);

            //mendapatkan data gender
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.gender);
            int selectedId = radioGroup.getCheckedRadioButtonId();
            RadioButton gender = (RadioButton) findViewById(selectedId);

            //mendapatkan value dari object
            String namaS      =  nama.getText().toString();
            String passwordS      =  password.getText().toString();
            String negaraS      =  negara.getText().toString();
            String hpS      =  hp.getText().toString();
            String genderS = gender.getText().toString();

            //membuat intent
            Intent intent = new Intent(MainActivity.this, Test.class);
            intent.putExtra("nama", namaS);
            intent.putExtra("pass", passwordS);
            intent.putExtra("negara", negaraS);
            intent.putExtra("hp", hpS);
            intent.putExtra("gender", genderS);

            //pindah activity
            startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        // do nothing because you don't want them to leave when it's pressed
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

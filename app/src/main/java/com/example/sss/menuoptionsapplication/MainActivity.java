package com.example.sss.menuoptionsapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Felix IT");

       // getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case android.R.id.home:
                //onBackPressed();
                finish();
                Toast.makeText(getApplicationContext(),"Home Pressed",Toast.LENGTH_SHORT).show();
                break;

            case R.id.item_setting:
                Toast.makeText(getApplicationContext(),"Setting Pressed",Toast.LENGTH_SHORT).show();
                break;

            case R.id.item_profile:
                Toast.makeText(getApplicationContext(),"Profile Pressed",Toast.LENGTH_SHORT).show();
                break;

            case R.id.item_logout:
                Toast.makeText(getApplicationContext(),"Logout Pressed",Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(getApplicationContext(),"Default",Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

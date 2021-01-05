package com.example.animatednavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ChipNavigationBar chipNavigationBar;
    private Fragment fragment = null;
    public CardView c1,c2,c3,c4,c5,c6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chipNavigationBar = findViewById(R.id.chipNavigation);

        chipNavigationBar.setItemSelected(R.id.home, true);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();

        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                switch (i) {
                    case R.id.home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.cart:
                        fragment = new CartFragment();
                        break;
                    case R.id.profile:
                        fragment = new ProfileFragment();
                        break;

                }

                if (fragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
                }
            }
        });


       c1 =  (CardView) findViewById(R.id.cd1);
       c2 = findViewById(R.id.cd2);
       c3 =  (CardView) findViewById(R.id.cd3);
       c4 =  (CardView) findViewById(R.id.cd4);
       c5 =  (CardView) findViewById(R.id.cd5);
       c6 =  (CardView) findViewById(R.id.cd6);

       c1.setOnClickListener(this);
       c2.setOnClickListener(this);
       c3.setOnClickListener(this);
       c4.setOnClickListener(this);
       c5.setOnClickListener(this);
       c6.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.cd1:
                i = new Intent(this, recycleview.class);
                startActivity(i);
                break;

            case R.id.cd2:
                i = new Intent(this, recycleview.class);
                startActivity(i);
                break;
            case R.id.cd3:
                i = new Intent(this, recycleview.class);
                startActivity(i);
                break;
            case R.id.cd4:
                i = new Intent(this, recycleview.class);
                startActivity(i);
                break;
            case R.id.cd5:
                i = new Intent(this, recycleview.class);
                startActivity(i);
                break;
            case R.id.cd6:
                i = new Intent(this, recycleview.class);
                startActivity(i);
                break;


        }


    }
}
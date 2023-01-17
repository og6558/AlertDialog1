package com.example.alertdialog1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Random;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {
    /**
     * The Btn 1.
     */
    Button btn1,
    /**
     * The Btn 2.
     */
    btn2,
    /**
     * The Btn 3.
     */
    btn3,
    /**
     * The Btn 4.
     */
    btn4,
    /**
     * The Btn 5.
     */
    btn5;
    /**
     * The Adb 1.
     */
    AlertDialog.Builder adb1,
    /**
     * The Adb 2.
     */
    adb2,
    /**
     * The Adb 3.
     */
    adb3,
    /**
     * The Adb 4.
     */
    adb4,
    /**
     * The Adb 5.
     */
    adb5;
    /**
     * The Lo.
     */
    ConstraintLayout LO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LO = findViewById(R.id.LO);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn1);
        btn3 = findViewById(R.id.btn1);
        btn4 = findViewById(R.id.btn1);
        btn5 = findViewById(R.id.btn1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);


        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        String st = item.getTitle().toString();
        if(st.equals("Cradits")){
            Intent dorel2 = new Intent(this,SecondActivity.class);
            startActivity(dorel2);
        }
        return true;
    }


    /**
     * Button 1 click.
     *
     * @param view the view
     */
    public void button1click(View view) {
        adb1 = new AlertDialog.Builder(this);
        adb1.setTitle("First");
        adb1.setMessage("Hey! lets start!");


        AlertDialog ad1 = adb1.create();
        ad1.show();
    }

    /**
     * Button 2 click.
     *
     * @param view the view
     */
    public void button2click(View view) {
        adb2 = new AlertDialog.Builder(this);
        adb2.setTitle("Second");
        adb2.setMessage("Hey! lets keep going!");
        adb2.setIcon(R.drawable.brazil);

        AlertDialog ad2 = adb2.create();
        ad2.show();
    }

    /**
     * Button 3 click.
     *
     * @param view the view
     */
    public void button3click(View view) {
        adb3 = new AlertDialog.Builder(this);
        adb3.setTitle("Third");
        adb3.setMessage("Hey! lets keep going again!");
        adb3.setIcon(R.drawable.brazil);
        adb3.setCancelable(false);
        adb3.setPositiveButton("OK", new  DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {

            }
        });

        AlertDialog ad3 = adb3.create();
        ad3.show();
    }

    /**
     * Button 4 click.
     *
     * @param view the view
     */
    public void button4click(View view) {
        adb4 = new AlertDialog.Builder(this);
        adb4.setTitle("Fourth");
        adb4.setMessage("Hey! change the screen color if u want!!");
        adb4.setIcon(R.drawable.brazil);
        adb4.setCancelable(false);
        adb4.setPositiveButton("COLOR", new  DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                LO.setBackgroundColor(color);

            }
        });
        adb4.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });

        AlertDialog ad4 = adb4.create();
        ad4.show();
    }

    /**
     * Button 5 click.
     *
     * @param view the view
     */
    public void button5click(View view) {
        adb5 = new AlertDialog.Builder(this);
        adb5.setTitle("Last");
        adb5.setMessage("Hey! change the screen color if u want and now u can reset it!!");
        adb5.setIcon(R.drawable.brazil);
        adb5.setCancelable(false);
        adb5.setPositiveButton("COLOR", new  DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                LO.setBackgroundColor(color);

            }
        });
        adb5.setNeutralButton("RESET", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                LO.setBackgroundColor(Color.WHITE);
            }
        });


        adb5.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });

        AlertDialog ad5 = adb5.create();
        ad5.show();
    }
}
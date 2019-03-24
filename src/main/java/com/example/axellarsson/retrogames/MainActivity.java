package com.example.axellarsson.retrogames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        button = (Button) findViewById( R.id.TicTacKnapp );
        button1 = (Button) findViewById( R.id.MemoryKnapp );

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTicTac();
            }
        } );

        button1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMemory();
            }
        } );
    }
    public void openTicTac() {
        Intent intent = new Intent( this, TicTac.class );
        startActivity( intent );
    }
    public void openMemory(){
        Intent intent = new Intent(this, Memory.class);
        startActivity( intent );
    }
}

package sg.edu.rp.c346.id19020844.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnPassInt, btnPassChar;
    TextView tvP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassInt=findViewById(R.id.buttonPassInteger);
        btnPassChar=findViewById(R.id.buttonPassChar);
        tvP=findViewById(R.id.tvPrint);

        btnPassInt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);

            }
        });

        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ThirdActivity.class);
                i.putExtra("Char", 'a');
                startActivity(i);
            }
        });

        tvP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this, FourthActivity.class);
                j.putExtra("Double", 99.99);
                startActivity(j);
            }
        });
    }

}

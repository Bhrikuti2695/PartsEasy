package co.project.partseasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BuisnessType extends AppCompatActivity {
Button bt_proceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buisness_type);
        bt_proceed=findViewById(R.id.btn_bt_proceed);
        bt_proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(BuisnessType.this, RegistrationActivity.class);
                startActivity(in);
            }
        });
    }
}
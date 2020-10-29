package co.project.partseasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AddressActivity extends AppCompatActivity {
Button submit_address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        submit_address= findViewById(R.id.btn_submit_addresss);
        submit_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AddressActivity.this, CartActivity.class);
                startActivity(in);
            }
        });
    }
}
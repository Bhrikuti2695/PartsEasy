package co.project.partseasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProductDetailActivity extends AppCompatActivity {
Button create_booking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        create_booking= findViewById(R.id.btn_create_booking);
        create_booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent in = new Intent(ProductDetailActivity.this, ReviewBookingActivity.class);
                    startActivity(in);
            }
        });
    }
}
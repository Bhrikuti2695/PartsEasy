package co.project.partseasy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import co.project.partseasy.ui.Booking.BookingFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ReviewBookingActivity extends AppCompatActivity {
Button createbooking_final;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_booking);
        createbooking_final= findViewById(R.id.btn_createbooking_final);
        createbooking_final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ReviewBookingActivity.this, "Order booked successfully!", Toast.LENGTH_SHORT).show();
                Intent in = new Intent(ReviewBookingActivity.this, NavigationActivity.class);
                startActivity(in);
            }
        });
    }
}
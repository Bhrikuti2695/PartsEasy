package co.project.partseasy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainFilter extends AppCompatActivity {
LinearLayout supplier_list;
TextView supplier, category;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_filter);
        supplier_list= findViewById(R.id.supplier_list);
        supplier= findViewById(R.id.Supplier_filter);
        category= findViewById(R.id.Category_filter);
        supplier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                supplier_list.setVisibility(View.VISIBLE);
            }
        });
        category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                supplier_list.setVisibility(View.VISIBLE);
            }
        });

    }
}
package co.project.partseasy;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewStructure;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookingViewHolder extends RecyclerView.ViewHolder {

    private TextView view;
    private final Context context;

    public BookingViewHolder(@NonNull View itemView) {
        super(itemView);
        view = itemView.findViewById(R.id.ranText);
        context = itemView.getContext();
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(context, OrderReviewActivity.class);
                context.startActivity(in);
            }
        });
    }

    public TextView getView(){
        return view;
    }
}
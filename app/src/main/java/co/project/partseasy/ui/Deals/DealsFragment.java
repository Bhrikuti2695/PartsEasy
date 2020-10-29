package co.project.partseasy.ui.Deals;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.project.partseasy.DealsAdapter;
import co.project.partseasy.MainFilter;
import co.project.partseasy.R;

public class DealsFragment extends Fragment {
RecyclerView recyclerView;
ImageView filter;
Activity context;
    private DealsViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        context= getActivity();
        galleryViewModel =
                ViewModelProviders.of(this).get(DealsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_deals, container, false);
        recyclerView =root.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(root.getContext()));
        recyclerView.setAdapter(new DealsAdapter(1234));
        filter= root.findViewById(R.id.filter);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(context, MainFilter.class);
                startActivity(in);
            }
        });


        return root;
    }

}
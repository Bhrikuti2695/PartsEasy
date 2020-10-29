package co.project.partseasy.ui.Booking;

import androidx.lifecycle.ViewModelProviders;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.project.partseasy.AddressActivity;
import co.project.partseasy.BookingAdapter;
import co.project.partseasy.DealsAdapter;
import co.project.partseasy.MainFilter;
import co.project.partseasy.R;

public class BookingFragment extends Fragment {

    private BookingViewModel mViewModel;
     RecyclerView booking_recyclerview;
     Activity context;
    public static BookingFragment newInstance() {
        return new BookingFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.booking_fragment, container, false);

        booking_recyclerview =root.findViewById(R.id.recyclerview_bookings);
        booking_recyclerview.setHasFixedSize(true);
        booking_recyclerview.setLayoutManager(new LinearLayoutManager(root.getContext()));
        booking_recyclerview.setAdapter(new BookingAdapter(1234));
        return  root;
    }



}
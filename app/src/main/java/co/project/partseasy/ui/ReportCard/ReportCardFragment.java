package co.project.partseasy.ui.ReportCard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import co.project.partseasy.BottomSheetDialog;
import co.project.partseasy.R;

public class ReportCardFragment extends Fragment {

    private ReportCardViewModel slideshowViewModel;
   LinearLayout trackAssembly, auger, electric, hydraulic, bottomitems;
   Button track,augerbtn, electricbtn, hydraulicbtn;
   TextView trackdrive, trackmount, batterybox, junctionbox, circuitswitch,
           hydraluictank, dieseltank, augerdrive, transversebeam,bearingmouseing ;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(ReportCardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_shop_by_category, container, false);
             trackAssembly =root.findViewById(R.id.track_assembly_layout);
             auger= root.findViewById(R.id.auger_layout);
             electric= root.findViewById(R.id.Electric_and_layout);
             hydraulic= root.findViewById(R.id.Hydraulic_layout);
             bottomitems= root.findViewById(R.id.bottom_items);
             track=root.findViewById(R.id.btn_track_assembly);
             augerbtn= root.findViewById(R.id.btn_auger);
             electricbtn=root.findViewById(R.id.btn_electric);
             hydraulicbtn=root.findViewById(R.id.btn_hydralic);
             trackdrive=root.findViewById(R.id.trackdriver);
        trackmount=root.findViewById(R.id.trackmount);
        batterybox=root.findViewById(R.id.batterybox);
        junctionbox=root.findViewById(R.id.junctionbox);
        circuitswitch=root.findViewById(R.id.circuitswitch);
        hydraluictank=root.findViewById(R.id.hydraulic);
        dieseltank=root.findViewById(R.id.diesel_tank);
        augerdrive=root.findViewById(R.id.augerdrum);
        transversebeam=root.findViewById(R.id.transverse);
        bearingmouseing=root.findViewById(R.id.bearing_mousing);

track.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        trackAssembly.setVisibility(View.VISIBLE);
        auger.setVisibility(View.GONE);
        electric.setVisibility(View.GONE);
        hydraulic.setVisibility(View.GONE);
        trackdrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              bottomitems.setVisibility(View.VISIBLE);
            }
        });
        trackmount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomitems.setVisibility(View.VISIBLE);
            }
        });
    }
});
        augerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomitems.setVisibility(View.GONE);
                auger.setVisibility(View.VISIBLE);
                trackAssembly.setVisibility(View.GONE);
                electric.setVisibility(View.GONE);
                hydraulic.setVisibility(View.GONE);
            }
        });
        electricbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomitems.setVisibility(View.GONE);
                auger.setVisibility(View.GONE);
                trackAssembly.setVisibility(View.GONE);
                hydraulic.setVisibility(View.GONE);
                electric.setVisibility(View.VISIBLE);
            }
        });
        hydraulicbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auger.setVisibility(View.GONE);
                trackAssembly.setVisibility(View.GONE);
                electric.setVisibility(View.GONE);
                hydraulic.setVisibility(View.VISIBLE);
            }
        });


        return root;
    }
}
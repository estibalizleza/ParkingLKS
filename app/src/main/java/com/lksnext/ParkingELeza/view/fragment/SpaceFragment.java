package com.lksnext.ParkingELeza.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.lksnext.parkingplantilla.R;

public class SpaceFragment extends Fragment {

    private Button buttonConfirm, buttonBack;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_space, container, false);

        buttonConfirm = view.findViewById(R.id.buttonConfirm);
        buttonBack = view.findViewById(R.id.buttonBack);

        buttonConfirm.setOnClickListener(v -> {
            // Confirm reservation logic
            // ...
            ((ParentFragment)getParentFragment()).confirmReservation();
        });

        buttonBack.setOnClickListener(v -> {
            ((ParentFragment)getParentFragment()).goToTimeFragment();
        });

        return view;
    }
}

package com.lksnext.ParkingELeza.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.lksnext.parkingplantilla.R;

public class TimeFragment extends Fragment {

    private TimePicker timePicker;
    private SeekBar seekBarDuration;
    private Button buttonContinue, buttonBack;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_time, container, false);

        timePicker = view.findViewById(R.id.timePicker);
        seekBarDuration = view.findViewById(R.id.seekBarDuration);
        buttonContinue = view.findViewById(R.id.buttonContinue);
        buttonBack = view.findViewById(R.id.buttonBack);

        buttonContinue.setOnClickListener(v -> {
            ((ParentFragment)getParentFragment()).goToSpaceFragment();
        });

        buttonBack.setOnClickListener(v -> {
            ((ParentFragment)getParentFragment()).goToDateFragment();
        });

        return view;
    }
}

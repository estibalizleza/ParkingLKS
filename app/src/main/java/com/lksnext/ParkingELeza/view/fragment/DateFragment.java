package com.lksnext.ParkingELeza.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.lksnext.parkingplantilla.R;

public class DateFragment extends Fragment {

    private DatePicker datePicker;
    private Button buttonContinue;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_date, container, false);

        datePicker = view.findViewById(R.id.datePicker);
        buttonContinue = view.findViewById(R.id.buttonContinue);

        buttonContinue.setOnClickListener(v -> {
            ((ParentFragment)getParentFragment()).goToTimeFragment();
        });

        return view;
    }
}

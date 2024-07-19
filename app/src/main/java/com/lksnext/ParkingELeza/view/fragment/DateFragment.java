package com.lksnext.ParkingELeza.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.SeekBar;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.lksnext.parkingplantilla.R;

public class DateFragment extends BottomSheetDialogFragment {

    private DatePicker datePicker;
    private TimePicker timePicker;
    private SeekBar seekBarDuration;
    private Button buttonConfirm;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_date, container, false);

        datePicker = view.findViewById(R.id.datePicker);
        timePicker = view.findViewById(R.id.timePicker);
        seekBarDuration = view.findViewById(R.id.seekBarDuration);
        buttonConfirm = view.findViewById(R.id.buttonConfirm);

        buttonConfirm.setOnClickListener(v -> confirmReservation());

        return view;
    }

    private void confirmReservation() {
        int day = datePicker.getDayOfMonth();
        int month = datePicker.getMonth();
        int year = datePicker.getYear();

        int hour = timePicker.getCurrentHour();
        int minute = timePicker.getCurrentMinute();

        int duration = seekBarDuration.getProgress();

        String reservationDetails = String.format("Reserva para el %d/%d/%d a las %d:%02d por %d horas",
                day, month + 1, year, hour, minute, duration);

        Toast.makeText(getContext(), reservationDetails, Toast.LENGTH_LONG).show();

        // Here you can also pass data to the activity or save the reservation details as needed
        // Dismiss the BottomSheet
        dismiss();
    }
}

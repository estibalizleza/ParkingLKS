package com.lksnext.ParkingELeza.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.lksnext.parkingplantilla.R;

public class ParentFragment extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_parent, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Start with DateFragment
        goToDateFragment();
    }

    public void goToDateFragment() {
        replaceFragment(new DateFragment());
    }

    public void goToTimeFragment() {
        replaceFragment(new TimeFragment());
    }

    public void goToSpaceFragment() {
        replaceFragment(new SpaceFragment());
    }

    public void confirmReservation() {
        // Handle reservation confirmation logic
        // ...
        dismiss(); // Dismiss the bottom sheet
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.reservation_frame, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}

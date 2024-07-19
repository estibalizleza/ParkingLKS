package com.lksnext.ParkingELeza.view.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.lksnext.ParkingELeza.view.fragment.MainFragment;
import com.lksnext.ParkingELeza.view.fragment.ParentFragment;
import com.lksnext.ParkingELeza.view.fragment.UserFragment;
import com.lksnext.ParkingELeza.view.fragment.reservationsFragment;
import com.lksnext.parkingplantilla.R;
import com.lksnext.parkingplantilla.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Initial fragment setup
        replaceFragment(new MainFragment());

        // Configuración del clic del FloatingActionButton (FAB)
        FloatingActionButton fab = binding.fab;
        fab.setOnClickListener(view -> showReservationBottomSheet());

        // Handling item selection in BottomNavigationView
        binding.bottomNavigationView.setBackground(null); // Optional: to remove background

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.newres:
                    replaceFragment(new MainFragment());
                    return true;

                case R.id.person:
                    replaceFragment(new UserFragment());
                    return true;

                case R.id.reservations:
                    replaceFragment(new reservationsFragment());
                    return true;
            }
            return false;
        });
    }

    private void showReservationBottomSheet() {
        ParentFragment bottomSheetFragment = new ParentFragment();
        bottomSheetFragment.show(getSupportFragmentManager(), bottomSheetFragment.getTag());
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}

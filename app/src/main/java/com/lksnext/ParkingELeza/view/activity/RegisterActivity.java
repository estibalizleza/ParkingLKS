    package com.lksnext.ParkingELeza.view.activity;

    import android.os.Bundle;

    import androidx.appcompat.app.AppCompatActivity;
    import androidx.appcompat.widget.Toolbar;
    import androidx.lifecycle.ViewModelProvider;

    import com.lksnext.parkingplantilla.R;
    import com.lksnext.parkingplantilla.databinding.ActivityRegisterBinding;
    import com.lksnext.ParkingELeza.viewmodel.RegisterViewModel;

    public class RegisterActivity extends AppCompatActivity {

        private ActivityRegisterBinding binding;
        private RegisterViewModel registerViewModel;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //Asignamos la vista/interfaz de registro
            binding = ActivityRegisterBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());

            //Asignamos el viewModel de register
            registerViewModel = new ViewModelProvider(this).get(RegisterViewModel.class);

            Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar2);
            setSupportActionBar(myToolbar);
            // agrega flecha
            if (getSupportActionBar() != null){
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setDisplayShowHomeEnabled(true);
            }
        }

        @Override
        public boolean onSupportNavigateUp() {
            onBackPressed();
            return true;
        }
    }
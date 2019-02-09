package es.iessaladillo.pedrojoya.pr08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;
import es.iessaladillo.pedrojoya.pr08.ui.detail.DetailFragment;
import es.iessaladillo.pedrojoya.pr08.ui.main.MainFragment;
import es.iessaladillo.pedrojoya.pr08.ui.settings.SettingsFragment;
import utils.FragmentUtils;

public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);

        vm = ViewModelProviders.of(this).get(MainActivityViewModel.class);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}

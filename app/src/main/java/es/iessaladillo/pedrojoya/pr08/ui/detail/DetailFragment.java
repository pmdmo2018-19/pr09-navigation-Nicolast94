package es.iessaladillo.pedrojoya.pr08.ui.detail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import es.iessaladillo.pedrojoya.pr08.MainActivityViewModel;
import es.iessaladillo.pedrojoya.pr08.R;
import utils.ToastUtils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DetailFragment extends Fragment {


    public static DetailFragment newInstance() {
        return new DetailFragment();
    }

    NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.detail_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
        navController = NavHostFragment.findNavController(this);
        setupToolbar();
        setupListeners();
    }

    private void setupListeners() {
        FloatingActionButton fab = ActivityCompat.requireViewById(requireActivity(), R.id.fabDetailfrag);
        fab.setOnClickListener(v -> ToastUtils.toast(getContext(), "Details have been saved"));
    }


    private void setupToolbar() {
        Toolbar toolbar = ActivityCompat.requireViewById(requireActivity(), R.id.toolBarDetailFrag);
        CollapsingToolbarLayout collapToolbarLayout = ActivityCompat.requireViewById(requireActivity(), R.id.collapToolBarLay);
        toolbar.setTitle(getString(R.string.title_DetailFragment));
        AppBarConfiguration appBarConfig = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupWithNavController(collapToolbarLayout, toolbar, NavHostFragment.findNavController(this), appBarConfig);
    }


}

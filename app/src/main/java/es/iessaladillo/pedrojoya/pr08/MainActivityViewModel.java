package es.iessaladillo.pedrojoya.pr08;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.preference.PreferenceManager;
import es.iessaladillo.pedrojoya.pr08.ui.settings.SharedPreferencesStringLiveData;

public class MainActivityViewModel extends AndroidViewModel {

    private final LiveData<String> loremType;


    MainActivityViewModel(@NonNull Application application) {
        super(application);
        loremType = new SharedPreferencesStringLiveData(
                PreferenceManager.getDefaultSharedPreferences(application),
                application.getString(R.string.listPreferenceKey),
                application.getString(R.string.prefLoremType));
    }

    public LiveData<String> getLoremType() {
        return loremType;
    }
}

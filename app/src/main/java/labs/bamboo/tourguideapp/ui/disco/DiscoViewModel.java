package labs.bamboo.tourguideapp.ui.disco;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DiscoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DiscoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is disco fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
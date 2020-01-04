package com.example.fragmentinterfacecomm.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    MutableLiveData<String> mNameliveData=new MutableLiveData<String>();


    public void setName(String name) {
        mNameliveData.setValue(name);
    }

    public LiveData<String> getName() {
        return mNameliveData;
    }
}

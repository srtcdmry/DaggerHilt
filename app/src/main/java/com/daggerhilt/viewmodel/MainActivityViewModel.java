package com.daggerhilt.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.daggerhilt.R;
import com.daggerhilt.model.RecyclerData;
import com.daggerhilt.network.RetroRepository;
import com.daggerhilt.network.RetroServiceInterface;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MainActivityViewModel extends ViewModel {
    MutableLiveData<List<RecyclerData>> liveData;

    @Inject
    RetroServiceInterface retroServiceInterface;

    @Inject
    public MainActivityViewModel(){
        liveData = new MutableLiveData();

    }

    public MutableLiveData<List<RecyclerData>> getLiveData(){
        return liveData;
    }

    public void makeAPICall(){
        RetroRepository retroRepository = new RetroRepository(retroServiceInterface);
        retroRepository.makeAPICall("us",liveData);
    }


}

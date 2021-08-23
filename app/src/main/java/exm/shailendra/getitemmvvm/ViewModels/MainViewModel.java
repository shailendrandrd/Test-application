package exm.shailendra.getitemmvvm.ViewModels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import exm.shailendra.getitemmvvm.Models.MainModel;
import exm.shailendra.getitemmvvm.Repository.MainRepository;

public class MainViewModel extends ViewModel {

    public MainRepository repository;

    public MutableLiveData<MainModel> responseLiveData;

    public MutableLiveData<MainModel> getResponseLiveData() {

        repository = new MainRepository();

        responseLiveData = repository.getResponseLiveData();

        return responseLiveData;

    }

}

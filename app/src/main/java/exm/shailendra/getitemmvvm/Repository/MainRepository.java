package exm.shailendra.getitemmvvm.Repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;



import exm.shailendra.getitemmvvm.Models.MainModel;
import exm.shailendra.getitemmvvm.Utility.NetworkUtility.ApiInterface;
import exm.shailendra.getitemmvvm.Utility.NetworkUtility.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainRepository {

    public MutableLiveData<MainModel> resposeLiveData;

    ApiInterface apiInterface;

    public MutableLiveData<MainModel> getResponseLiveData() {

        resposeLiveData = new MutableLiveData<>();

        apiInterface = new RetrofitClient().getRetrofitInstance1();

        Call<MainModel> call = apiInterface.getResponse();

        call.enqueue(new Callback<MainModel>() {
            @Override
            public void onResponse(Call<MainModel> call, Response<MainModel> response) {

                MainModel model = response.body();
                resposeLiveData.postValue(model);

                Log.d("onResponse#######",model.getBookingId());


            }

            @Override
            public void onFailure(Call<MainModel> call, Throwable t) {

                Log.d("onFailure#######",t.getMessage());
                Log.d("onFailure",t.getCause().getMessage());

            }
        });

        return resposeLiveData;

    }
}

package exm.shailendra.getitemmvvm.Utility.NetworkUtility;

import exm.shailendra.getitemmvvm.Models.MainModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterface {


    @Headers("Accept: application/json")
    @GET("assignment/booking.json")
    Call<MainModel> getResponse();




}

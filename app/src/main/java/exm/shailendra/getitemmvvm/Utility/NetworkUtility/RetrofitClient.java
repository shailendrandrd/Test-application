package exm.shailendra.getitemmvvm.Utility.NetworkUtility;

import java.util.concurrent.TimeUnit;

import ir.alirezabdn.wp7progress.BuildConfig;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    Retrofit retrofit1 = null;


    public final String  BASE_URL1 = "https://clstorageapp.blob.core.windows.net/";



    public ApiInterface getRetrofitInstance1() {

        HttpLoggingInterceptor.Level typeOfLogging;

        if(BuildConfig.BUILD_TYPE.contentEquals("debug")) {

            typeOfLogging = HttpLoggingInterceptor.Level.BODY;
        }
        else {
            typeOfLogging = HttpLoggingInterceptor.Level.NONE;
        }

        //HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor().setLevel(typeOfLogging);
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor)
                .readTimeout(120, TimeUnit.SECONDS)
                .connectTimeout(120, TimeUnit.SECONDS).build();

        retrofit1 = new Retrofit.Builder().client(client).baseUrl(BASE_URL1)
                .addConverterFactory(GsonConverterFactory.create()).build();

        return retrofit1.create(ApiInterface.class);
    }


}

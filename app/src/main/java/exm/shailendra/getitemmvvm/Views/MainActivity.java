package exm.shailendra.getitemmvvm.Views;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import exm.shailendra.getitemmvvm.Models.MainModel;
import exm.shailendra.getitemmvvm.R;
import exm.shailendra.getitemmvvm.ViewModels.MainViewModel;
import exm.shailendra.getitemmvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity  {

    ActivityMainBinding binding;
    MainViewModel viewModel;
    String name;
    String mobile;
    String email;
    String sourceAddress;
    String destinationAddress;
    String destLocation;
    Double sourceLatitude;
    Double sourceLongitude;
    Double destLatitude;
    Double destLongitude;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




        binding.btnParse.setOnClickListener(v -> {


            binding.progressBar.showProgressBar();


            viewModel = new ViewModelProvider(this).get(MainViewModel.class);


            viewModel.getResponseLiveData().observe(this, new Observer<MainModel>() {
                @Override
                public void onChanged(MainModel mainModel) {
                    binding.progressBar.hideProgressBar();

                    name = mainModel.getCustomer().getFullName();
                    mobile = mainModel.getCustomer().getMobile();
                    email = mainModel.getCustomer().getEmail();

                   sourceAddress = "1858, 2821, Mission College Road Koramangala";
                   sourceLatitude = 12.933664;
                   sourceLongitude = 77.616179;


                    destinationAddress = mainModel.getDestination().getAddress().getAddress();
                    destLocation = mainModel.getDestination().getAddress().getLocation();
                    destLatitude = Double.valueOf(mainModel.getDestination().getAddress().getCoordinates().getLatitude());
                    destLongitude = Double.valueOf(mainModel.getDestination().getAddress().getCoordinates().getLongitude());



                    binding.txtName.setText(name);
                    binding.txtMob.setText(mobile);
                    binding.txtEmail.setText(email);


                    binding.txtSourceAddress.setText(sourceAddress);
                    binding.txtDestinationAddress.setText(destinationAddress +" " +destLocation);

                    showSourceAddress(sourceLatitude, sourceLongitude);
                    showDestination(destLatitude, destLongitude);

                }
            });



        });

    }

    private void showDestination(Double destLatitude, Double destLongitude) {

        binding.cardViewDestination.setOnClickListener(v -> {

            Intent destIntent = new Intent(MainActivity.this, DestinationMapsActivity.class);
            destIntent.putExtra("latitude", destLatitude);
            destIntent.putExtra("Longitude",destLongitude);
            startActivity(destIntent);

        });


    }

    private void showSourceAddress(Double sourceLatitude, Double sourceLongitude) {

        binding.cardViewSource.setOnClickListener(v -> {

           Intent sourceIntent = new Intent(MainActivity.this, SourceMapsActivity.class);
            sourceIntent.putExtra("latitude", sourceLatitude);
            sourceIntent.putExtra("Longitude",sourceLongitude);
            startActivity(sourceIntent);

        });


    }



}
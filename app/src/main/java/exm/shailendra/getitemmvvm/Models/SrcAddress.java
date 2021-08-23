package exm.shailendra.getitemmvvm.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SrcAddress {

    @SerializedName("address")
    @Expose
    private String address;


    @SerializedName("location")
    @Expose
    private String location;


    @SerializedName("city")
    @Expose
    private String city;

    @SerializedName("state")
    @Expose
    private String state;


    @SerializedName("postalCode")
    @Expose
    private String postalCode;

    @SerializedName("country")
    @Expose
    private String country;

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return this.location;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return this.city;
    }
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return this.state;
    }
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }
    public String getPostalCode(){
        return this.postalCode;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return this.country;
    }

}
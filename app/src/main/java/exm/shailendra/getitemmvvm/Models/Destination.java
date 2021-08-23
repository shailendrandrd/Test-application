package exm.shailendra.getitemmvvm.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Destination {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("address")
    @Expose
    private Address address;

//    @SerializedName("AddressObject")
//    @Expose
//    private DestAddress DestAddressObject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public DestAddress getAddress() {
//        return DestAddressObject;
//    }
//
//    public void setAddress(DestAddress DestAddressObject) {
//        this.DestAddressObject = DestAddressObject;
//    }

    public Address getAddress(){
        return this.address;
    }

    public void setAddress(Address address){
        this.address = address;
    }


}

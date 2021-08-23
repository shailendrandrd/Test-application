package exm.shailendra.getitemmvvm.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MainModel {

    @SerializedName("context")
    @Expose
    private String context;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("bookingId")
    @Expose
    private String bookingId;

   /* @SerializedName("source")
    @Expose
    private String sourcee;*/

   /* @SerializedName("source")
    @Expose
    private Source source;*/


    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("customer")
    @Expose
    private Customer customer;
    @SerializedName("destination")
    @Expose
    private Destination destination;
    @SerializedName("vendor")
    @Expose
    private Vendor vendor;
    @SerializedName("bookingTime")
    @Expose
    private String bookingTime;
    @SerializedName("pickupTime")
    @Expose
    private String pickupTime;


    /*public String getSourcee() {
        return sourcee;
    }

    public void setSourcee(String sourcee) {
        this.sourcee = sourcee;
    }



    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

   /* public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }*/

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }
}

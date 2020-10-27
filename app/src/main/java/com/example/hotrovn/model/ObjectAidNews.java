package com.example.hotrovn.model;

public class ObjectAidNews {
    int imgLocation, imgDistributed, imgDeliveryCart;
    String txtLocation, txtDistraibuted, txtNumberReliefCampaign, txtDate;

    public ObjectAidNews(int imgLocation, int imgDistributed, int imgDeliveryCart, String txtLocation, String txtDistraibuted, String txtNumberReliefCampaign, String txtDate) {
        this.imgLocation = imgLocation;
        this.imgDistributed = imgDistributed;
        this.imgDeliveryCart = imgDeliveryCart;
        this.txtLocation = txtLocation;
        this.txtDistraibuted = txtDistraibuted;
        this.txtNumberReliefCampaign = txtNumberReliefCampaign;
        this.txtDate = txtDate;
    }

    public int getImgLocation() {
        return imgLocation;
    }

    public void setImgLocation(int imgLocation) {
        this.imgLocation = imgLocation;
    }

    public int getImgDistributed() {
        return imgDistributed;
    }

    public void setImgDistributed(int imgDistributed) {
        this.imgDistributed = imgDistributed;
    }

    public int getImgDeliveryCart() {
        return imgDeliveryCart;
    }

    public void setImgDeliveryCart(int imgDeliveryCart) {
        this.imgDeliveryCart = imgDeliveryCart;
    }

    public String getTxtLocation() {
        return txtLocation;
    }

    public void setTxtLocation(String txtLocation) {
        this.txtLocation = txtLocation;
    }

    public String getTxtDistraibuted() {
        return txtDistraibuted;
    }

    public void setTxtDistraibuted(String txtDistraibuted) {
        this.txtDistraibuted = txtDistraibuted;
    }

    public String getTxtNumberReliefCampaign() {
        return txtNumberReliefCampaign;
    }

    public void setTxtNumberReliefCampaign(String txtNumberReliefCampaign) {
        this.txtNumberReliefCampaign = txtNumberReliefCampaign;
    }

    public String getTxtDate() {
        return txtDate;
    }

    public void setTxtDate(String txtDate) {
        this.txtDate = txtDate;
    }
}

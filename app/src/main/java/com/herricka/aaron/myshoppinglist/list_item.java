package com.herricka.aaron.myshoppinglist;

import java.util.UUID;

/**
 * Created by Aaron on 6/19/2015.
 */
public class list_item {

    private UUID mId;
    private String mTitle;
    private String mPrice;
    private String mQuantity;
    private String mLocation;
    private boolean mPurchased;

    public list_item() {
        // Generate unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getPrice() {
        return mPrice;
    }

    public void setPrice(String price) {
        mPrice = price;
    }

    public String getQuantity() {
        return mQuantity;
    }

    public void setQuantity(String quantity) {
        mQuantity = quantity;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public boolean isPurchased() {
        return mPurchased;
    }

    public void setPurchased(boolean purchased) {
        mPurchased = purchased;
    }
}

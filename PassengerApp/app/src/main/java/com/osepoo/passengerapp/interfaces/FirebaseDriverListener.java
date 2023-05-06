package com.osepoo.passengerapp.interfaces;


import com.osepoo.passengerapp.model.Driver;


public interface FirebaseDriverListener {

    void onDriverAdded(Driver driver);

    void onDriverRemoved(Driver driver);

    void onDriverUpdated(Driver driver);

}

package com.osepoo.passengerapp.interfaces;

@FunctionalInterface
public interface IPositiveNegativeListener {

    void onPositive();

    default void onNegative() {

    }
}

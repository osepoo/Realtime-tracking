package com.osepoo.driverapp.interfaces;

@FunctionalInterface
public interface IPositiveNegativeListener {

    void onPositive();

    default void onNegative() {

    }
}

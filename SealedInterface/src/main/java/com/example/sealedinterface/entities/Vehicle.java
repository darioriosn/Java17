package com.example.sealedinterface.entities;

// Example of a sealed interface
sealed public interface Vehicle permits Car, Motorcycle, Bicycle {
    String getName();
    int getWheels();
}

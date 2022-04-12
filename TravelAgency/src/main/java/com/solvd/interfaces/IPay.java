package com.solvd.interfaces;

import com.solvd.travelagency.Cashier;
import com.solvd.travelagency.Client;

public interface IPay {
    void pay(double packageTotal, Cashier cashier);
}

package com.example.exo2tpp5;

import java.util.ArrayList;

public class Data {
    public String NomPlanete;
    public String TaillePlanete;

     Data(String Nomplanete , String taillePlanete) {
        NomPlanete = Nomplanete;
        TaillePlanete = taillePlanete;
    }

    public String getNomPlanete() {
        return NomPlanete;
    }

    public String getTaillePlanete() {
        return TaillePlanete;
    }

}

package com.class1.entity;


import javax.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id")
    private int vehicle_id;
    @Column(name = "vehicle_name")
    private String vehicle_name;
    @Column(name = "vehicle_name")
    private String vehicle_model;
    @Column(name = "year_of_manufacture")
    private int year_of_manufacture;
    @Column(name = "vehicle_color")
    private String vehicle_color;

    public Vehicle() {

    }

    public Vehicle(int vehicle_id, String vehicle_name, String vehicle_model, int year_of_manufacture, String vehicle_color) {
        this.vehicle_id = vehicle_id;
        this.vehicle_name = vehicle_name;
        this.vehicle_model = vehicle_model;
        this.year_of_manufacture = year_of_manufacture;
        this.vehicle_color = vehicle_color;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getVehicle_name() {
        return vehicle_name;
    }

    public void setVehicle_name(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }

    public String getVehicle_model() {
        return vehicle_model;
    }

    public void setVehicle_model(String vehicle_model) {
        this.vehicle_model = vehicle_model;
    }

    public int getYear_of_manufacture() {
        return year_of_manufacture;
    }

    public void setYear_of_manufacture(int year_of_manufacture) {
        this.year_of_manufacture = year_of_manufacture;
    }

    public String getVehicle_color() {
        return vehicle_color;
    }

    public void setVehicle_color(String vehicle_color) {
        this.vehicle_color = vehicle_color;
    }

    @Override
    public String toString() {
        return "Vehicle [vehicle_id=" + vehicle_id + ", vehicle_name=" + vehicle_name + ", vehicle_model=" + vehicle_model + ", year_of_manufacture=" + year_of_manufacture + ",vehicle_color" + vehicle_color + "]";
    }

}

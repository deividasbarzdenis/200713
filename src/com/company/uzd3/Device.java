package com.company.uzd3;

public class Device {
    private boolean isOn;
    private static int newId =0;
    private int id;

    Device(boolean deviceStatus){
        this.id = newId++;
        this.isOn = deviceStatus;
    }
    public void ping() throws DeviceIsOffException{
        if(!isOn()){
            throw new DeviceIsOffException();
        }
    }
    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}

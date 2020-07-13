package com.company.uzd3;

import java.util.List;

public class Monitoring {
    public static void pingAllDevices(List<Device> devices){
        System.out.println("PING starts");
        for(Device device: devices){
            try {
                device.ping();
                System.out.println(String.format("DEVICE: %s with id %s is on", device.getClass().getSimpleName(),device.getId()));
            }catch (DeviceIsOffException e){
                System.out.println(String.format("DEVICE: %s with id %s is off", device.getClass().getSimpleName(),device.getId()));
            }

        }
        System.out.println("PING is finished");

    }
}

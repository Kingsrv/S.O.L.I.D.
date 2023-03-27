package com.srv.solid.ocp;

public class notificationServiceOcp {
    public void sendOTP(String medium){
        if(medium.equals("email")){
            //write email related logic
        }
        if(medium.equals("phone")){
            //write phone related logic
        }
        // if we want to add medium whatsapp - it will violate OCP if we modify this code
        // it's better to extend this class or create an interface
    }
}

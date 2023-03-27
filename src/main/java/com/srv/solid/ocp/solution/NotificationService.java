package com.srv.solid.ocp.solution;

public interface NotificationService {

    void sendOTP(String medium);
    void sendTransactionReport(String medium);
}

package com.company.uzd4;

import java.util.ArrayList;
import java.util.List;

public class EmailSender {

    public void sendEmail(List<Email> emails) {
        ArrayList<Email> resendingEmail = new ArrayList<>();
        while (!emails.isEmpty()) {
            for (Email email : emails) {
                try {
                    if (email.getStatus().equals(Status.RESENT)){
                        System.out.println(String.format("RESENDING: email to: %s", email.getTo()));
                    }else {
                        System.out.println(String.format("SENDING: email to: %s", email.getTo()));
                    }
                    NetworkConnector.send(email);
                    email.setStatus(Status.SEND);
                    System.out.println(String.format("Successfully: to send email to: %s", email.getTo()));

                } catch (NoNetworkException e) {
                    email.setStatus(Status.RESENT);
                    /*Thread.sleep(3000)*/
                    ;
                    resendingEmail.add(email);
                    System.out.println(String.format("Failed: to send email to: %s", email.getTo()));
                }

            }
            emails = resendingEmail;
            resendingEmail = new ArrayList<>();

            System.out.println();
            if (!emails.isEmpty()){
                try {

                    Thread.sleep(3000);
                }catch (InterruptedException ignore){

                }
            }
        }
    }
}

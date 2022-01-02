package pl.coderslab.homeDay3.service;

import java.time.LocalDateTime;

public class SimpleCustomerLogger implements CustomerLogger{
    @Override
    public void log() {
        System.out.println(LocalDateTime.now()+": Customer operation");
    }


}

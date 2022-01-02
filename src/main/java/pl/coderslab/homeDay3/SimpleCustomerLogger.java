package pl.coderslab.homeDay3;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SimpleCustomerLogger implements CustomerLogger{
    @Override
    public void log() {
        System.out.println(LocalDateTime.now()+": Customer operation");
    }


}

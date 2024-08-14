package com.DigitalNurture.EmployeeManagementSystem.Projection;
import org.springframework.beans.factory.annotation.Value;

public interface EmployeeProjection {

    Long getId();

    String getName();

    @Value("#{target.email}")
    String getEmail(); // Explicitly specifying to include the email field

    // You can also include other fields or nested projections if needed
}

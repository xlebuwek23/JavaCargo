package com.example.barbershop;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;
import java.time.LocalDateTime;

@Entity
public class Client {
    private Long id;
    private String name;
    private LocalDateTime date_of_service;
    private String service;
    private String barber;

    protected Client() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate_of_service() {
        return date_of_service;
    }

    public void setDate_of_service(LocalDateTime date_of_service) {
        this.date_of_service = date_of_service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getBarber() {
        return barber;
    }

    public void setBarber(String barber) {
        this.barber = barber;
    }

    @Override
    public String toString(){
        return "Client = [id=" +  id + ", name=" + name +", date_of_service=" + date_of_service +", service=" + service +", barber=" + barber + "]";
    }

}

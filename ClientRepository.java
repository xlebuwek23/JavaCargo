package com.example.barbershop;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientRepository extends JpaRepository<Client, Long> {
    @Query("SELECT p From Client p WHERE CONCAT(p.name, '', p.date_of_service, '', p.service, '', p.barber) LIKE %?1%")
    List<Client> search(String keyword);

}
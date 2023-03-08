package com.example.Project2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Project2.Models.Hotel;

@Repository
public interface HotelRepo extends JpaRepository<Hotel,Integer>{

}

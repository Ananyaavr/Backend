package com.example.Project2.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project2.Models.Hotel;
import com.example.Project2.Repositories.HotelRepo;


@Service
public class HotelService {
	@Autowired
	HotelRepo repo;
	public String updateDetails(Hotel stu) {
		repo.save(stu);
		return "updated";
	}
	public String deleteDetails(int user_id) {
		repo.deleteById(user_id);
		return "Id deleted";
	}

}

package com.example.Project2.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project2.Models.Hotel;
import com.example.Project2.Repositories.HotelRepo;
import com.example.Project2.Services.HotelService;
@RestController
@CrossOrigin
public class HotelController {
	@Autowired
	HotelRepo repo;
	@Autowired
	HotelService ser;
	@GetMapping("/get")
	List<Hotel> getList(){
		return repo.findAll();
     }
	@PostMapping("/post")
    public Hotel create(@RequestBody Hotel stu) {
	return repo.save(stu);
}
	@PutMapping("/update")
	public String update(@RequestBody Hotel stu) {
		 return ser.updateDetails(stu);
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		 return ser.deleteDetails(id);
	}
}

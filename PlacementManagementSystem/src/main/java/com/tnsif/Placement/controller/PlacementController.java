package com.tnsif.Placement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.Placement.entity.Placement;
import com.tnsif.Placement.repository.PlacementRepository;

@RestController
public class PlacementController {
	
	@Autowired
	PlacementRepository repo;
	
	@GetMapping("/StudentService")
	public Placement addPlacement ()
	{
		Placement p = new Placement("Dharani","CSE",91);
		return repo.save(p);
	}
	
	@GetMapping("/StudentService")
	public List<Placement> getplacement() {
		return repo.findAll();
		
		}
	
	@GetMapping("/StudentService/{regid}")
	public Placement getPlacementById(@PathVariable Integer regid)
	{
		return repo.findById(regid).get();
	}
	
	
	@DeleteMapping("/StudentService/{regid}")
	public void deletePlacement(@PathVariable Integer regid)
	{
	    repo.deleteById(regid);
	}
	
	@PutMapping("/StudentService/{regid}")
	public Placement updatePlacement(@PathVariable Integer regid, @RequestBody Placement P)
	{
		P.setRegid(regid);
		return repo.save(P);

	}
}






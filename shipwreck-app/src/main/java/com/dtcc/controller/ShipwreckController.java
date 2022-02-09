package com.dtcc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dtcc.model.Shipwreck;

@RequestMapping("api/v1/")
@RestController
public class ShipwreckController {

	@RequestMapping(value="shipwrecks", method=RequestMethod.POST)
//	@ResponseBody
	public Shipwreck save(@RequestBody Shipwreck wreck){
		return ShipwreckStub.create(wreck);
	}
	
	@RequestMapping(value="shipwrecks",method=RequestMethod.GET)
	public List<Shipwreck> get(){
		
		return ShipwreckStub.list();
	}
	
	
}

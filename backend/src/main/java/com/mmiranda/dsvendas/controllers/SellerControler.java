package com.mmiranda.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmiranda.dsvendas.dto.SellerDTO;
import com.mmiranda.dsvendas.services.SellerService;

@RestController
@RequestMapping(value = "/sellers")
public class SellerControler {
	
	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll(){
		List<SellerDTO> list = service.finAll();
		return ResponseEntity.ok(list);
	}
}

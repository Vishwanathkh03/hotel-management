/**
 * 
 */
package org.vishwa.springboot.employeeportal.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

/**
 * @author YUVI
 *
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class HomeController {
	
	@ApiOperation(value = "Say Hello", response = String.class)
	@GetMapping("/home/Hello")
	public ResponseEntity<String> sayHello() {
		return ResponseEntity.ok("Hello");
	}

}

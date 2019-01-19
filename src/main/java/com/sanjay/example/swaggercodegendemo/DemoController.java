/**
 * 
 */
package com.sanjay.example.swaggercodegendemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Sanjay
 *
 */
@Controller
@RequestMapping("/sanjay")
public class DemoController {
	
	@GetMapping("/getName")
	public @ResponseBody String getName(){
		return "sanjay";
	}
	
}

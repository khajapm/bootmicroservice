package com.deloitte.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.demo.entities.VisualisatonData;
import com.deloitte.demo.service.PostApiService;

@RestController
public class PostApiController {
	
	@Autowired
	private PostApiService postService;
	
	
	@RequestMapping(value="/pie", method=RequestMethod.GET)
	List<VisualisatonData> getAllChartData() {
		return postService.getAllChartData();
	}
	
}

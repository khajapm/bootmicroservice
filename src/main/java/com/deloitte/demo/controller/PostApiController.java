package com.deloitte.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.deloitte.demo.entities.VisualisatonData;
import com.deloitte.demo.service.PostApiService;

import javax.annotation.PostConstruct;

@RestController
public class PostApiController {
	
	@Autowired
	private PostApiService postService;
	
	
	@RequestMapping(value="/pie", method=RequestMethod.GET)
	List<VisualisatonData> getAllChartData() {

		return postService.getAllChartData();
	}

	@RequestMapping(value="/chart", method=RequestMethod.GET)
	List<VisualisatonData> getData() {
		return postService.getAllChartData();
	}

	@RequestMapping(value="/addPie", method=RequestMethod.POST)
    @ResponseBody
	ResponseEntity<VisualisatonData> addChartData(@RequestBody VisualisatonData viz) {
		postService.addData(viz);
        return new ResponseEntity<VisualisatonData>(viz, HttpStatus.OK);
	}

	@RequestMapping(value="/editPie", method=RequestMethod.POST)
    ResponseEntity<VisualisatonData> editChartData(@RequestBody VisualisatonData viz) {
		postService.addData(viz);
        return new ResponseEntity<VisualisatonData>(viz, HttpStatus.OK);
	}


	@RequestMapping(value="/removePie", method=RequestMethod.POST)
    ResponseEntity<VisualisatonData> removeChartData(@RequestBody VisualisatonData viz) {
		postService.deleteData(viz);
        return new ResponseEntity<VisualisatonData>(viz, HttpStatus.OK);
	}
}

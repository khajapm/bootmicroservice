package com.deloitte.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.deloitte.demo.entities.VisualisatonData;

public interface ChartDataRepository extends CrudRepository<VisualisatonData, String> {
	
}

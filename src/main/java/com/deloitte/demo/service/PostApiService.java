package com.deloitte.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.demo.entities.VisualisatonData;
import com.deloitte.demo.repository.ChartDataRepository;

@Service
public class PostApiService {


    @Autowired
    private ChartDataRepository chartRepo;


    public List<VisualisatonData> getAllChartData() {
        List<VisualisatonData> listOfCharts = new ArrayList<>();
        System.out.println("Querying Database");
        try {
            System.out.println(chartRepo.count());
            chartRepo.findAll().forEach(listOfCharts::add);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(listOfCharts.size());
        return listOfCharts;
    }

    public void addData(VisualisatonData viz){
        try{
            chartRepo.save(viz);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("added "+viz.getData());
    }

    public VisualisatonData getData(int id){
        VisualisatonData viz=null;
        try{
            viz = chartRepo.findOne(String.valueOf(id));
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("added "+viz.getData());
        return viz;
    }

    public void editData(VisualisatonData viz){
        //VisualisatonData viz= getData(id);
        addData(viz);
    }

    public void deleteData(VisualisatonData viz){
        //VisualisatonData viz= getData(id);
    	System.out.println("deleting - "+viz.getId());
        chartRepo.delete(viz);
    }
}

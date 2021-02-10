package com.example.hades.controller;


import com.example.hades.Api.paisaApi.Request.ConsumerPriceGetRequest;
import com.example.hades.Api.paisaApi.Request.ConsumerPricePostRequest;
import com.example.hades.Api.paisaApi.Response.ConsumerPriceGetResponse;
import com.example.hades.Api.paisaApi.Response.hotel_room_details;
import com.example.hades.service.ConsumerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ConsumerController{



    @Autowired
    ConsumerService consumerService;


    @PostMapping(value = "/postdata")
    public hotel_room_details postData(@RequestBody ConsumerPricePostRequest consumerPricePostRequest) {
        return  consumerService.postFloorRequest(consumerPricePostRequest);
    }

    @PostMapping("/getdata")
    public ConsumerPriceGetResponse getData(@RequestBody ConsumerPriceGetRequest consumerPriceGetRequest) {

        return  consumerService.getData(consumerPriceGetRequest);
    }
    @PostMapping("/hi")
    public String hi(@RequestBody hotel_room_details obj)
    {
        return "jygegugg";
    }


    @PostMapping(value="/post/upload")
    public String postCsvData(@RequestParam("file") MultipartFile file) throws IOException {
        return consumerService.postconsumerRequestbyCsv(file);
    }
//    @Override
//    public void run(String... args) throws Exception {
//        int hotelid = 2;
//        int r_id = 3;
//        LocalDate date = LocalDate.now();
//        Map<String,Double> m = new HashMap<>();
//        m.put("abc",9.0);
//        m.put("gjkg",9.8);
//        String rea = "hrgj";
//        ConsumerPriceGetRequest obj = new ConsumerPriceGetRequest();
//        obj.setHotel_id(hotelid);
//        obj.setRoom_category_id(r_id);
//        obj.setDate(date);
//
//        System.out.println("rdtyukjl" + consumerService.getData(obj));
//
//    }
//    @GetMapping(value = "/getAll")
//    public List<hotel_room_details> getDataAll(@RequestBody ConsumerPriceGetAll consumerPriceGetAll) {
//        return  consumerService.getAllDetails(consumerPriceGetAll);
//    }



}

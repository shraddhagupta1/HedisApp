package com.example.hades.service;


import com.example.hades.Api.paisaApi.PaisaApiManager;
import com.example.hades.Api.paisaApi.Request.ConsumerPriceGetRequest;
import com.example.hades.Api.paisaApi.Request.ConsumerPricePostRequest;
import com.example.hades.Api.paisaApi.Response.ConsumerPriceGetResponse;
import com.example.hades.Api.paisaApi.Response.hotel_room_details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class ConsumerService {
    @Autowired
    PaisaApiManager paisaApiManager;

    public hotel_room_details postFloorRequest(ConsumerPricePostRequest consumerPricePostRequest)
    {


        return paisaApiManager.postData(consumerPricePostRequest);
    }


    public ConsumerPriceGetResponse getData(ConsumerPriceGetRequest consumerPriceGetRequest)
    {

        ConsumerPriceGetResponse consumerPriceGetResponse = paisaApiManager.getData(consumerPriceGetRequest);
        return consumerPriceGetResponse;
    }

    public String postconsumerRequestbyCsv(MultipartFile file) throws IOException {
        return paisaApiManager.upload_file(file);

    }

//    public List<hotel_room_details> getAllDetails(ConsumerPriceGetAll floorRequest)
//    {
//        return hotelRequestRepo.findAllByHotel(floorRequest.getHotel_id(),floorRequest.getRoom_category_id());
//    }
}

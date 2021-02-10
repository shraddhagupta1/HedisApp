package com.example.hades.Api.paisaApi;

import com.example.hades.Api.paisaApi.Request.ConsumerPricePostRequest;
import com.example.hades.Api.paisaApi.Response.hotel_room_details;

import com.example.hades.Api.paisaApi.Request.ConsumerPriceGetRequest;
import com.example.hades.Api.paisaApi.Response.ConsumerPriceGetResponse;
import com.example.hades.exception.InternalServerException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.multipart.MultipartFile;


@Component
public class PaisaApiManager extends BaseApiManager {

    private static final Logger log = LoggerFactory.getLogger(com.example.hades.Api.paisaApi.PaisaApiManager.class);


    private final static String CONSUMER_PRICE_FETCH = "/getdata";
    private final static String CONSUMER_PRICE_POST = "/post";
    private final static String CONSUMER_UPLOAD_FILE = "/post/upload";






    public ConsumerPriceGetResponse getData(ConsumerPriceGetRequest request){

        ConsumerPriceGetResponse response;
        try {
            response =  super.post(CONSUMER_PRICE_FETCH, null, request, ConsumerPriceGetResponse.class, "");
        }catch (Exception e){
            throw new InternalServerException("Paisa did not return any data");
        }
        return response;
    }

    public hotel_room_details postData(ConsumerPricePostRequest request){

        hotel_room_details response;
        try {
            response =  super.post(CONSUMER_PRICE_POST, null, request, hotel_room_details.class, "");
        }catch (Exception e){
            throw new InternalServerException("Paisa did not return any data");
        }
        return response;
    }
//    public List<ConsumerPricePostRequestTmp> upload_file(@RequestParam("file") MultipartFile file)
//    {
//        List<ConsumerPricePostRequestTmp> response = new ArrayList<>();
//        try {
//            response = (List<ConsumerPricePostRequestTmp>) super.postfile(CONSUMER_UPLOAD_FILE,null,file,ConsumerPricePostRequestTmp.class,"","");
//        } catch (Exception e) {
//            throw new InternalServerException("Paisa did not return any data");
//        }
//        return response;
//    }

    public String upload_file(MultipartFile file) {

        String response;

        Resource invoicesResource = file.getResource();
        LinkedMultiValueMap<String, Object> parts = new LinkedMultiValueMap<>();
        parts.add("file", invoicesResource);

        try {
            response = super.postfile(CONSUMER_UPLOAD_FILE,null,parts, String.class, "");
        }catch (Exception e){

            throw new InternalServerException("Paisa HotelRoomTypes api unable to upload file");
        }
        return response;
    }


}

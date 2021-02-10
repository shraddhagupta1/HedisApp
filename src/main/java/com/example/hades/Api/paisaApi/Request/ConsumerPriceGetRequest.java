package com.example.hades.Api.paisaApi.Request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsumerPriceGetRequest{
    @JsonProperty("hotel_id")
    private Integer hotel_id;

    @JsonProperty("room_category_id")
    private Integer room_category_id;

    @JsonProperty("date")
    private String date;
}

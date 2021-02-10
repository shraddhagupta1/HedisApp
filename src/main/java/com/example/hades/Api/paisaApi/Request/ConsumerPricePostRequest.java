package com.example.hades.Api.paisaApi.Request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsumerPricePostRequest {

    @JsonProperty("hotel_id")
    private Integer hotel_id;

    @JsonProperty("room_category_id")
    private Integer room_category_id;

    @JsonProperty("date")
    private String date;

    @JsonProperty("prices")
    private Map<String, Double> prices;

    @JsonProperty("reason")
    private String reason;
}

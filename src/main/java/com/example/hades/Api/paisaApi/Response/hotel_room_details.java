package com.example.hades.Api.paisaApi.Response;




import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
        import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class hotel_room_details {



    @JsonProperty("id")
    private Integer id;

    @JsonProperty("hotel_id")
    private Integer hotel_id;

    @JsonProperty("room_category_id")
    private Integer room_category_id;

    @JsonProperty("prices")
    private String prices;

    @JsonProperty("date")
    private String date;

    @JsonProperty("status")
    private int status;

    @JsonProperty("created_at")
    private LocalDateTime created_at;

    @JsonProperty("updated_at")
    private LocalDateTime updated_at;

    @JsonProperty("reason")
    private String reason;

}
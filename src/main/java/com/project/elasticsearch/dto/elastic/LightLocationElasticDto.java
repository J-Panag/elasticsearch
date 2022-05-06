package com.project.elasticsearch.dto.elastic;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class LightLocationElasticDto implements Serializable {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private AddressElasticDto address;
    @JsonProperty("description")
    private String description;
    @JsonProperty("url")
    private String url;

    public LightLocationElasticDto(){}

}

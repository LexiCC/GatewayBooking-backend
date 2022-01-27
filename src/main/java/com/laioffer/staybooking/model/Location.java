package com.laioffer.staybooking.model;

import org.springframework.data.elasticsearch.core.geo.GeoPoint;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.GeoPointField;

import java.io.Serializable;

@Document(indexName = "loc") //是elastic search里面的annotation
public class Location implements Serializable {
    private static final long serialVersionUID = 1L;

    @Field(type = FieldType.Long)
    private Long id; //elastic search 搜出来的id
    private GeoPoint geoPoint; //经纬度

    public Location(Long id, GeoPoint geoPoint) {
        this.id = id;
        this.geoPoint = geoPoint;
    }

    public Long getId() {
        return id;
    }

    public GeoPoint getGeoPoint() {
        return geoPoint;
    }
}

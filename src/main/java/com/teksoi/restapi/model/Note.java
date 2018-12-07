package com.teksoi.restapi.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Note extends BaseModel {

    private String title;
    private String content;
}
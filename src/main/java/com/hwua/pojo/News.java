package com.hwua.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class News implements Serializable {
    private Long id;
    private String news;
    private Integer score;

}

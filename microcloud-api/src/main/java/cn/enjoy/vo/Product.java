package cn.enjoy.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {
    private Long productId;
    private String productName;
    private String productDesc;
}

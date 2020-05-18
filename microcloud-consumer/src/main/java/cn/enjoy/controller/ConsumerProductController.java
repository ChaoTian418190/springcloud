package cn.enjoy.controller;

import cn.enjoy.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerProductController {
    public static final String PRODUCT_GET_URL = "http://localhost:8080/prodcut/get/";
    public static final String PRODUCT_LIST_URL="http://localhost:8080/prodcut/list/";
    public static final String PRODUCT_ADD_URL = "http://localhost:8080/prodcut/add/";
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private HttpHeaders httpHeaders;

    @GetMapping("/product/get")
    public Object getProduct(long id){
//        Product forObject = restTemplate.getForObject(PRODUCT_GET_URL + id, Product.class);
        Product forObject = restTemplate.exchange(PRODUCT_GET_URL + id, HttpMethod.GET,new HttpEntity<>(httpHeaders), Product.class).getBody();
        return forObject;
    }

    @GetMapping("/product/list")
    public List<Object> getProductList(){
        List forObject = restTemplate.getForObject(PRODUCT_LIST_URL, List.class);
        return forObject;
    }

    @PostMapping("/product/add")
    public Object addProduct(@RequestBody Product product){
        Boolean aBoolean = restTemplate.postForObject(PRODUCT_ADD_URL, Product.class, Boolean.class);
        return aBoolean;
    }
}

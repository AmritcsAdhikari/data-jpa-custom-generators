package com.app.amrit.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name="PRODUCT_TABLE")
public class Product implements Serializable {

    @Id
    @GeneratedValue(generator = "test")
    @GenericGenerator(name ="test", strategy = "com.app.amrit.generators.MyCustomGenerator")
    @Column(name ="p_id")
    private String prodId;

    @Column(name="p_name")
    private String prodName;

    @Column(name="p_price")
    private Double prodPrice;
}

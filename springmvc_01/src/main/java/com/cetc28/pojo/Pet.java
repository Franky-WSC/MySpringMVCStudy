package com.cetc28.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: WSC
 * @version: 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pet implements Serializable {
    private String petName;
    private String petType;
}

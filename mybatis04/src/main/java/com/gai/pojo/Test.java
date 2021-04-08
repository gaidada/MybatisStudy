package com.gai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author gai
 * @create 2021--04--08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Test {
    private int id;
    private String name;
    private String password;

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

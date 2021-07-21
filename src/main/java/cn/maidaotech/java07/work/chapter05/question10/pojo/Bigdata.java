package cn.maidaotech.java07.work.chapter05.question10.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Bigdata {
    private Long id;

    private Long userId;

    private String username;

    private Integer amount;

    private Integer status;

    private Long createdAt;

    private Long updatedAt;


}
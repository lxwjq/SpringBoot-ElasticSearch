package cn.thislx.springbootes.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @Author: LX
 * @Description:
 * @Date: Created in 11:24 2018/11/6
 * @Modified by:
 */
@Data
@ToString
@NoArgsConstructor
public class EsModel {

    private String id;

    private String name;

    private int age;

    private Date date;
}

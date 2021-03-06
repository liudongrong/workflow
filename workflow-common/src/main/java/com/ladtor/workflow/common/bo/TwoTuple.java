package com.ladtor.workflow.common.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author liudongrong
 * @date 2019/1/31 19:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TwoTuple implements Serializable {
    private String serialNo;
    private Integer version;
}

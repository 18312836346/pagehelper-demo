package com.mybatis.pagehelperdemo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {
    private Integer msgId;
    private String msgText;
    private String msgSummary;
}
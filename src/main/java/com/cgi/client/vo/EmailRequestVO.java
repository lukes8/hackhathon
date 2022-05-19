package com.cgi.client.vo;

import lombok.Data;

@Data
public class EmailRequestVO {
    private String subject;
    private String to;
    private String template;
}

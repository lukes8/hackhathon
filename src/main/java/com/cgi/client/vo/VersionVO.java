package com.cgi.client.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class VersionVO {
    private String version;
    private String commitId;
    private String commitTime;
}

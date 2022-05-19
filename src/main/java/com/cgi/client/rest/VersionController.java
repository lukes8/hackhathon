package com.cgi.client.rest;

import com.cgi.client.vo.VersionVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VersionController {

    @Value("${git.build.version}")
    private String version;

    @Value("${git.commit.id}")
    private String commitId;

    @Value("${git.commit.time}")
    private String commitTime;

    @GetMapping(value = "/versions")
    List<VersionVO> getVersion() {
        List result = new ArrayList();
        result.add(new VersionVO(version, commitId, commitTime));
        return result;
    }
}

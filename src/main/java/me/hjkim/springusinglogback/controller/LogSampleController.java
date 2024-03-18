package me.hjkim.springusinglogback.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogSampleController {

    /**
     * getLog()
     * log level 순서 : [trace > debug > info > worn > error]
     */
    @GetMapping("/")
    public void getLog() {
        log.trace("trace message");
        log.debug("debug message");
        log.info("info message");
        log.warn("error message");
        log.error("error message");
    }
}

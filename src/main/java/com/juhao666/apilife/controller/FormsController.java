package com.juhao666.apilife.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

@Controller
@RequestMapping("/forms")
@Slf4j
public class FormsController {

    @GetMapping("/editors")
    public String editors() {
        return "forms-editors";
    }

    @GetMapping("/elements")
    public String elements() {
        return "forms-elements";
    }

    @GetMapping("/layouts")
    public String layouts() {
        return "forms-layouts";
    }

    @GetMapping("/validation")
    public String validation() {
        return "forms-validation";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("username") String username,
                         @RequestParam("email") String email,
                         @RequestParam("password") String password,
                         @RequestParam("number") int number,
                         @RequestPart("file") MultipartFile file,
                         @RequestPart("files") MultipartFile[] files
    ) throws IOException {
        log.info("input v" + "value: username={}, email={} password={} file size={} multipart file count={}", username, email, password, file.getSize(), files.length);
        Path path = Paths.get("src/main/resources/files/");
        if (!file.isEmpty()) {
            file.transferTo(path.resolve(Objects.requireNonNull(file.getOriginalFilename())));
        }
        if (files.length>0)
            for (MultipartFile f : files) {
                f.transferTo(path.resolve(Objects.requireNonNull(f.getOriginalFilename())));
            }
        return "index";
    }
}

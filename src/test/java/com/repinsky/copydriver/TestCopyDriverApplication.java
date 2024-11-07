package com.repinsky.copydriver;

import org.springframework.boot.SpringApplication;

public class TestCopyDriverApplication {

    public static void main(String[] args) {
        SpringApplication.from(CopyDriverApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}

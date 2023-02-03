package com.example.sentinel;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

public class HelloWorld {

    @SentinelResource("HelloWorld")
    public void helloWorld() {
        // 资源中的逻辑
        System.out.println("SentinelResource helloWorld() hello world");
    }
}

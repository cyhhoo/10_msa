package com.mycompany.firstservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient /* 해당 Application을 서비스 발견 Client로 활성화 */
public class Chap02FirstServiceLectureSourceApplication {

  public static void main(String[] args) {
    SpringApplication.run(Chap02FirstServiceLectureSourceApplication.class, args);
  }

}

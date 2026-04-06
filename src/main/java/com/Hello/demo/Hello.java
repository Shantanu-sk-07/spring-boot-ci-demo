package com.Hello.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    public String Hello() {
        return "Hello, Good Morning! ☀️\n\n" +
                "I am Dragon1347, a passionate Junior Cloud Developer ☁️🚀\n\n" +
                "I specialize in building, deploying, and managing scalable applications using modern cloud technologies. " +
                "With hands-on experience in cloud platforms, containerization (Docker 🐳), and CI/CD pipelines 🔄, " +
                "I focus on delivering efficient, secure, and reliable solutions.\n\n" +
                "I am continuously learning and improving my skills in cloud computing, automation, and DevOps practices ⚙️📈 " +
                "to create high-performance systems that meet real-world business needs.\n\n" +
                "Thank you for visiting! 😊";
    }
}

package com.codekul.JavaSpring;

//import com.codekul.JavaSpring.aop.BoyStudent;
//import com.codekul.JavaSpring.aop.GirlStudent;
//import com.codekul.JavaSpring.aop.Human;
//import com.codekul.JavaSpring.aop.MyException;
import com.codekul.JavaSpring.di.Company;
import com.codekul.JavaSpring.di.Employee;
import com.codekul.JavaSpring.ioc.Jio;
import com.codekul.JavaSpring.ioc.SimConfig;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Logger;

@SpringBootApplication

public class JavaSpringApplication {

//  private  final static Logger logger = LoggerFactory.getLogger(JavaSpringApplication.class);

    public static void main(String[] args)  {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(JavaSpringApplication.class, args);

       Company company = applicationContext.getBean(Company.class);
      company.showCompanyEmp();


//        Human human = applicationContext.getBean(Human.class);
//        human.wakeup();

//        BoyStudent boyStudent = applicationContext.getBean(BoyStudent.class);
//        //joinPoint
//        int i = boyStudent.study(1);
//        System.out.println(i);
//        //joinPoint
//       // boyStudent.exce();
//
//        GirlStudent girlStudent = applicationContext.getBean(GirlStudent.class);
//        girlStudent.studyChemistry();
//


    }


    @GetMapping("hiiSpring")
    public String getMsg() {
        return "Hii Spring boot";
    }

}
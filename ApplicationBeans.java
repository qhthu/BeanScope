package demo.spring.beanscope;

import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.boot.web.servlet.context.WebApplicationContextServletContextAwareProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
public class ApplicationBeans {

    @Bean("people")
    public People beanPeople(){
        People p = new People();
        p.setId(1);
        p.setName("Quach Hong Thu");
        return p;
    }

    @Bean
    @Scope("singleton")
    public People singletonPeople(){
        People p = new People();
        p.setId(1);
        p.setName("Quach Hong Thu");
        return p;
    }

    @Bean
    @Scope("prototype")
    public People prototypePeople(){
        People p = new People();
        p.setId(2);
        p.setName("Vo Thi Hong Nhun");
        return p;
    }

    @Bean
    public Student requestStudent(){
        Student s = new Student();
        s.setGrade(12);
        return s;
    }

    @Bean
    public Employee sessionEmployee(){
        Employee e = new Employee();
        e.setCompanyName("ITSJ");
        return e;
    }

    @Bean
    public ApplicationScope applicationScope(){
        ApplicationScope a = new ApplicationScope();
        a.setNumber(1230);
        return a;
    }
}

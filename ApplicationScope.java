package demo.spring.beanscope;

import org.springframework.boot.WebApplicationType;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.xml.ws.WebServiceContext;

@Component
@Scope("application")
public class ApplicationScope{
    private Integer number;

    public ApplicationScope() {
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}

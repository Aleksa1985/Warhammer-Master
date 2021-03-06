/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexsoft.warhammermaster;

import alexsoft.warhammermaster.model.Caracter;

import alexsoft.warhammermaster.component.service.TestClass2;
import alexsoft.warhammermaster.component.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author Aleksa Jonic
 */
@Component
public class Test {
    
    public static void main(String[] args) {
        
       ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
       Test p = ctx.getBean(Test.class);
       p.start(args);
    }
    
     @Autowired
    private TestService testService;
    private void start(String[] args) {
        System.out.println("my beans method: " + testService.returnSomething());
    }
    
    public String callBeanFromService() {
        return new TestClass2().callMeSomething();

    }
}

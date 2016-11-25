/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexsoft.warhammermaster.component;

import alexsoft.warhammermaster.component.service.ArmorService;
import alexsoft.warhammermaster.model.Caracter;


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
    
    @Autowired
    ArmorService armorService;
   
     
    public static void main(String[] args) {
        // TODO Auto-generated method stub
            System.out.println("test");
            ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
            System.out.println("ctx>>"+ctx);

         
            Test myDemo=ctx.getBean(Test.class);
            System.out.println(myDemo);
            myDemo.callService(ctx);


    }

    public void callService(ApplicationContext ctx) {
        // TODO Auto-generated method stub
        System.out.println("---callService---");
        System.out.println(armorService);
        armorService.getAllArmorsFromRepository();

    }
    

   
    
  
}

package alexsoft.warhammermaster.component;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleksa Jonic
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {

    public void launch() {
        String[] contextPaths = new String[] {"applicationContext.xml"};
        new ClassPathXmlApplicationContext(contextPaths);
        
        
        
        
        
    }
}

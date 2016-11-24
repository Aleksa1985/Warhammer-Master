/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexsoft.warhammermaster.component.service;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aleksa Jonic
 */
@Service
@Configurable
public class TestService {
    
    
    public String returnSomething() {
        return "vratio sam stogodj!";

    }
    
}

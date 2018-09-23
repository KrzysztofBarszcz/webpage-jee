package com.github.krzysztofbarszcz.webpage.jee.testfacelet;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named
@RequestScoped
public class Test {
    Logger logger = LoggerFactory.getLogger(Test.class);
    
    public void log(){
        logger.info("Sample log");
    }
}

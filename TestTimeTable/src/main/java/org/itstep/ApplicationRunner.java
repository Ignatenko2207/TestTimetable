package org.itstep;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class ApplicationRunner
{
    public static void main( String[] args )
    {
    	ApplicationContext contex=SpringApplication.run(ApplicationRunner.class, args);
    }
}

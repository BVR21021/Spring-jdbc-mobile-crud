package com.venky;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
        MobileBean mb=(MobileBean)ctx.getBean("id3");
                //mb.create();
                  //mb.insert();
        //mb.delete();
        mb.update();
    }
}

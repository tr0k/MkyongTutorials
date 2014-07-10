package pl.tr0k;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tr0k on 2014-07-10.
 */
public class MainApp {

    private static Logger log = Logger.getLogger(MainApp.class.getName());

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        log.info("Test info.");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        System.out.printf(obj.getMessage());

        log.info("Exiting the program.");
    }
}

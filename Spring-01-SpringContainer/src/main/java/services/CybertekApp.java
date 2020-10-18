package services;

import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {

    public static void main(String[] args) {

//        BeanFactory container=new ClassPathXmlApplicationContext("config.xml");

        ApplicationContext container=new ClassPathXmlApplicationContext("config.xml");

        Mentor mentor2=(Mentor)container.getBean("PartTimeMentor");
        Mentor mentor=(Mentor)container.getBean("fullTimeMentor");
        Mentor mentor3=container.getBean("fullTimeMentor",Mentor.class);
        mentor3.createAccount();;
        mentor.createAccount();
        mentor2.createAccount();
    }
}

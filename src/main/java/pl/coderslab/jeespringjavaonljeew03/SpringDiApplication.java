package pl.coderslab.jeespringjavaonljeew03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.jeespringjavaonljeew03.beans.HelloWorld;

public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hw = ctx.getBean("helloWorld", HelloWorld.class);
        hw.hello();
        ctx.close();
    }
}

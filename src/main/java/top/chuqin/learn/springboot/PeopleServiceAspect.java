package top.chuqin.learn.springboot;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @auther wengchuqin
 * @create 2018/2/11
 */
@Aspect
@Component
public class PeopleServiceAspect {

    /*
     * 使用注解来标记切入点
     */
    @Pointcut("@annotation(top.chuqin.learn.springboot.AspectAction)")
    public void annotationPointcut(){ }

    @Before("annotationPointcut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        AspectAction action = method.getAnnotation(AspectAction.class);
        System.out.println("before " + action.name());
    }


    /*
     * 使用execution来查找切入点
     */
    @Pointcut("execution(* top.chuqin.learn.springboot.PeopleService.*(..))")
    public void executionPointcut(){}

    @After("executionPointcut()")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("after " + method.getName());
    }
}

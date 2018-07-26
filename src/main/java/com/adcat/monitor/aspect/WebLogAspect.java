package com.adcat.monitor.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Web层日志切面
 *
 * 在@Before中优先执行@Order(5)的内容，再执行@Order(10)的内容
 * 在@After和@AfterReturning中优先执行@Order(10)的内容，再执行@Order(5)的内容
 *
 */
@Aspect     //将一个java类定义为切面类
@Order(5)   //AOP切面的优先级
@Component
public class WebLogAspect {

    private static final Log log = LogFactory.getLog(WebLogAspect.class);


    ThreadLocal<Long> startTime = new ThreadLocal<>();

    //使用@Pointcut定义一个切入点，可以是一个规则表达式，比如下例中某个package下的所有函数，也可以是一个注解等。
    @Pointcut("execution(public * com.adcat.monitor.web..*.*(..))")
    public void webLog(){}

    //使用@Before在切入点开始处切入内容
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        startTime.set(System.currentTimeMillis());

        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        log.info("URL : " + request.getRequestURL().toString());
        log.info("HTTP_METHOD : " + request.getMethod());
        log.info("IP : " + request.getRemoteAddr());
        log.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        log.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));

    }

    //使用@AfterReturning在切入点return内容之后切入内容（可以用来对处理返回值做一些加工处理）
    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        log.info("RESPONSE : " + ret);
        log.info("SPEND TIME : " + (System.currentTimeMillis() - startTime.get()) + " ms");
    }

    //使用@After在切入点结尾处切入内容
    //使用@Around在切入点前后切入内容，并自己控制何时执行切入点自身的内容
    //使用@AfterThrowing用来处理当切入内容部分抛出异常之后的处理逻辑

}


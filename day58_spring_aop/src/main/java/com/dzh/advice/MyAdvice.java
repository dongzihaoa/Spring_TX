package com.dzh.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * ֪ͨ�� ��ǿ����
 */
@Aspect
public class MyAdvice {

    /**
     * �Լ�����һ���е㣬�����ظ�����
     */
    @Pointcut("execution(public void com.dzh.service.impl.UserServiceImpl.addUser())")
    public void pc(){}

    @Pointcut("execution(public void com.dzh.service.impl.UserServiceImpl.deleteUser())")
    public void pc02(){}

    /**
     * ǰ��֪ͨ  ����е��� || ����
     */

    @Before("MyAdvice.pc() || MyAdvice.pc02()")
    public void before() {
        System.out.println("ǰ��֪ͨ");
    }

    /**
     * ���յĺ���֪ͨ���쳣��񶼻�ִ��
     * ��ֱ��д Ҳ��д����� @Pointcut
     */
//    @After("execution(public void com.dzh.service.impl.UserServiceImpl.addUser())")
    @After("MyAdvice.pc() || MyAdvice.pc02()")
    public void after() {
        System.out.println("���յĺ���֪ͨ���쳣��񶼻�ִ��");
    }

    /**
     * ����֪ͨ�������쳣���ᱻִ��
     */
    @AfterReturning("MyAdvice.pc() || MyAdvice.pc02()")
    public void after_returning() {
        System.out.println("����֪ͨ�������쳣���ᱻִ��");
    }

    /**
     * �쳣֪ͨ
     */
    @AfterThrowing("MyAdvice.pc() || MyAdvice.pc02()")
    public void after_throwing() {
        System.out.println("�����쳣 (�쳣֪ͨ,�����쳣ʱ��ִ��)");
    }

    /**
     *����֪ͨ
     */

    @Around("MyAdvice.pc() || MyAdvice.pc02()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("����֪ͨǰ");
        proceedingJoinPoint.proceed();
        System.out.println("����֪ͨ��");

    }

}

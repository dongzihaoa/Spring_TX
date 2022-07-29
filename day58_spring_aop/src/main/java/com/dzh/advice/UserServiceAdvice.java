package com.dzh.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * ֪ͨ�� ��ǿ����
 */
public class UserServiceAdvice {

    /**
     * ǰ��֪ͨ
     */
    public void before() {
        System.out.println("ǰ��֪ͨ");
    }

    /**
     * ����֪ͨ
     */
    public void after() {
        System.out.println("���յĺ���֪ͨ���쳣��񶼻�ִ��");
    }

    /**
     * ����֪ͨ2
     */
    public void aftet_returning() {
        System.out.println("����֪ͨ�������쳣���ᱻִ��");
    }

    /**
     * �쳣֪ͨ
     */
    public void after_throwing() {
        System.out.println("�����쳣 (�쳣֪ͨ,�����쳣ʱ��ִ��)");
    }

    /**
     *�쳣֪ͨ
     */
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("����֪ͨǰ");
        proceedingJoinPoint.proceed();
        System.out.println("����֪ͨ��");
    }

}

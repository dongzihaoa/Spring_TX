package com.dzh.proxy.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyRent implements InvocationHandler {

    private Rent rent;

    //set����ע��
    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //�����������
    public Rent creatRentProxy() {
        return (Rent) Proxy.newProxyInstance(
                rent.getClass().getClassLoader(), //�������
                rent.getClass().getInterfaces(),//�ӿ��б�
                this
        );
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;

        /**
         *         ɸѡ��Ҫ��ǿ�ķ�����ֻ��ǿ�ӿڻ��߽ӿ�ʵ�����е�rent����
         */
        if ("rent".equals(method.getName())){
            publish();
            seeHouse();
        }
        result = method.invoke(rent,args);

        return result;
    }

    /**
     * ���̣�publish->seeHouse->����
     */
    public void publish(){
        System.out.println("�����ⷿ��Ϣ");
    }

    public void seeHouse(){
        System.out.println("���⻧����");
    }
}

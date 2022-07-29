package com.dzh.utils;

import lombok.Data;

@Data
public class JsonResult<T> {

    private Integer code;//���ص�״̬��
    private String msg; //������Ϣ
    private  T data;// ���ص�����

    /**
     *  ִ�гɹ�
     */
    public void success() {
       this.setCode(200);
       this.setMsg("success");
    }
    /**
     * ִ��ʧ��
     */

    public void error() {
        this.setMsg("failed!");
        this.setCode(-200);
    }
}

package com.dzh.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;

/**
 * �Զ�������Դ
 */
public class MyDruidDataSourceFactory extends PooledDataSourceFactory {
    public MyDruidDataSourceFactory() {
        // �滻Ĭ�ϵ�����Դ
        this.dataSource = new DruidDataSource();
    }
}
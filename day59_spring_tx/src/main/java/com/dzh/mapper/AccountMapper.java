package com.dzh.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * dao��ӿ�
 */
public interface AccountMapper {
    /**
     * ת������
     * @param fromAccount ת��id
     * @param money ת�˽��
     */
    void transferOut(@Param("fromAccountId") Integer fromAccount, @Param("money") Double money);

    void transferIn(@Param("toAccountId") Integer toAccount, @Param("money") Double money);

}

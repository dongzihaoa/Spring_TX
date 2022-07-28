package com.dzh.controller;

import com.dzh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ���Ʋ�
 */
@Controller
public class AccountController {

    private AccountService accountService;

    /**
     * ����set����ע������ �Զ�ע��
     * @param accountService ������
     */
    @Autowired
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    /**
     * ת�� fromAccount �� toAccount ת�� money
     * @param fromAccount ת��
     * @param toAccounts ת�� 1
     * @param money ���
     */
    public void transfer(Integer fromAccount, Integer toAccounts, Double money) {
        accountService.transfer(fromAccount,toAccounts,money);
    }

}

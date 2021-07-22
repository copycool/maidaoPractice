package cn.maidaotech.java07.java04.bank.service;

import cn.maidaotech.java07.java04.bank.model.Account;

public interface AccountService {
    Account findById(Integer id);
}
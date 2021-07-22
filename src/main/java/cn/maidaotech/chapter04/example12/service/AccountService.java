package cn.maidaotech.chapter04.example12.service;

import cn.maidaotech.chapter04.example12.model.Account;

public interface AccountService {
    // 当需要一个类实现多个service时，接口就极具优势
    Account findById(Integer id);
}
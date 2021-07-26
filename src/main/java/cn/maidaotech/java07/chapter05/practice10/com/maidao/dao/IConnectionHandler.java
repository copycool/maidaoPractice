package com.maidao.dao;

import java.sql.SQLException;

public interface IConnectionHandler {
    void executeConnect() throws ClassNotFoundException, SQLException;

    void clearConnect() throws SQLException;
}

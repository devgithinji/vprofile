package com.visualpathit.account.service;

import com.visualpathit.account.model.User;

import java.util.List;

public interface UserService {
    /**
     * {@inheritDoc}} !
     */
    void save(User user);

    /**
     * {@inheritDoc}} !
     */
    User findByUsername(String username);

    User findById(long id);

    /*public void updateUser(User user);*/
    public List<User> getList();
}

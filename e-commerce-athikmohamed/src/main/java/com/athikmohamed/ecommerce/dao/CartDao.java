package com.athikmohamed.ecommerce.dao;

import com.athikmohamed.ecommerce.entity.Cart;
import com.athikmohamed.ecommerce.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartDao extends CrudRepository<Cart, Integer > {
    public List<Cart> findByUser(User user);
}

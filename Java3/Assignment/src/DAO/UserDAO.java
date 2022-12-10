/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import ENTITY.User;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface UserDAO {
    public void insert(User us);
    public ArrayList<User> getList();
    public void setList(ArrayList<User> ds);
}

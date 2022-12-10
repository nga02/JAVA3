/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVICE;

import DAO.UserDAO;
import ENTITY.User;
import Repository.LoginRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class UserService implements UserDAO{
    private LoginRepository loginRepo;

    public UserService() {
        this.loginRepo = new LoginRepository();
    }

    @Override
    public void insert(User us) {
        
    }

    @Override
    public ArrayList<User> getList() {
        return this.loginRepo.getAll();
    }

    @Override
    public void setList(ArrayList<User> ds) {
        
    }
    
    public int login(String username, String password){
        ArrayList<User> lstUsers = loginRepo.getAll();
        for (User x : lstUsers) {
            if (x.getUserName().equals(username) && x.getPassWord().equals(password)) {
                if (x.getRole().equals("Teacher")) {
                    return 1;//Đăng nhập thành công - Trả về là đối tượng giảng viên
                } else {
                    return 0;//Đăng nhập thành công - Trả về là đối tượng đào tạo
                }
            }
        }
        return -1; //Đăng nhập thất bại
    }
}

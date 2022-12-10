package service;

import java.util.ArrayList;
import java.util.List;
import model.User;

public class LoginService {

    private List<User> ds;

    public LoginService() {
        this.ds = new ArrayList<>();
    }

    public void insert(User us) {
        this.ds.add(us);
    }

    public List<User> getList() {
        return this.ds;
    }

    public void setList(List<User> dsUser) {
        this.ds = dsUser;
    }
}

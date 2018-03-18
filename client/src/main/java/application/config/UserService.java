package application.config;

import application.stub.Admin;
import application.stub.AdminService;
import application.stub.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Admin service =new AdminService().getAdminPort();
        User user = service.findByUsername(username);
        UserWrapper userWrapper=new UserWrapper(user.getUsername(),user.getPassword(),user.getRole());
        userWrapper.isEnabled();
        return userWrapper;
    }
}

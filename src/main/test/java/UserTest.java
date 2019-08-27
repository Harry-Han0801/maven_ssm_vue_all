import com.hwua.entity.User;
import com.hwua.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class UserTest {
    
    @Autowired
    private UserService userService;
    
    @Test
    public void demo(){
        List<User> list = userService.selectUser();
        for (User user : list) {
            System.out.println(user);
        }
    }
}

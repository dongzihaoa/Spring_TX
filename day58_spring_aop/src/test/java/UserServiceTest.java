import com.dzh.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

    @Test
    public void testUserService() {
        //����spring�����ļ�
        ClassPathXmlApplicationContext ac =
                new ClassPathXmlApplicationContext("applicationContext.xml.bak");
        //��ȡ�����еĶ���
        UserService userService = (UserService) ac.getBean("userService");

        userService.addUser();
//        userService.deleteUser();

    }

}

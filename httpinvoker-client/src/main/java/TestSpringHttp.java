import model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * Description：
 * Created by ChenXin on 2016/12/1.
 */
public class TestSpringHttp {
    private static ApplicationContext context = new ClassPathXmlApplicationContext("application-servlet.xml");

    public static UserService getUserService(){
        return (UserService)context.getBean("httpTestService");
    }
    public static void main(String[] args) {
        User user = new User();
        user.setName("felix");
        user.setPassword("felix");
        getUserService().add(user);
    }
}

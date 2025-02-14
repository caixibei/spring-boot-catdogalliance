package tsai.spring.boot.features.user.controller;
import com.tsaiframework.boot.constant.WarningsConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tsai.spring.boot.features.user.service.UserService;
@RestController
@RequestMapping(value = "user")
@SuppressWarnings(WarningsConstants.SPRING_JAVA_AUTOWIRED_FIELDS_WARNING_INSPECTION)
public class UserController {

    @Autowired
    private UserService userService;

}

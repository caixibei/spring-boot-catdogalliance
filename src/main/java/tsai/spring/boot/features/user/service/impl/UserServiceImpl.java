package tsai.spring.boot.features.user.service.impl;
import com.github.yulichang.base.MPJBaseServiceImpl;
import org.springframework.stereotype.Service;
import tsai.spring.boot.features.user.mapper.UserMapper;
import tsai.spring.boot.features.user.pojo.User;
import tsai.spring.boot.features.user.service.UserService;

@Service
public class UserServiceImpl extends MPJBaseServiceImpl<UserMapper, User> implements UserService {

}

package tsai.spring.boot.features.user.mapper;
import com.tsaiframework.boot.base.mapper.TsaiMapper;
import org.apache.ibatis.annotations.Mapper;
import tsai.spring.boot.features.user.pojo.User;
@Mapper
public interface UserMapper extends TsaiMapper<User> {

}

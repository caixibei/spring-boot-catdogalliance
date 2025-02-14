package tsai.spring.boot.features.menu.mapper;
import com.tsaiframework.boot.base.mapper.TsaiMapper;
import org.apache.ibatis.annotations.Mapper;
import tsai.spring.boot.features.menu.pojo.Menu;
@Mapper
public interface MenuMapper extends TsaiMapper<Menu> {

}

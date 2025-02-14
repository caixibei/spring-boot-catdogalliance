package tsai.spring.boot.features.menu.pojo;
import com.baomidou.mybatisplus.annotation.TableName;
import com.tsaiframework.boot.base.pojo.TsaiPOJO;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "TSAI_MENU")
public class Menu extends TsaiPOJO{

}

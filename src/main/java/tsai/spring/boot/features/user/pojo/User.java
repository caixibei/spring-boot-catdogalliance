package tsai.spring.boot.features.user.pojo;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.tsaiframework.boot.base.pojo.TsaiPOJO;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "TSAI_USER")
public class User extends TsaiPOJO {

    @TableField(value = "USERNAME")
    private String username;

    @TableField(value = "PASSWORD")
    private String password;
}

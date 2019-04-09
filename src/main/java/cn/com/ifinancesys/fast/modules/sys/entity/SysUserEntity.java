package cn.com.ifinancesys.fast.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@TableName("sys_user")
public class SysUserEntity implements Serializable {

    private static final long serialVersionUID = -7355028780923558173L;

    /**
     * 用户ID
     */
    @TableId
    private Long userId;
}
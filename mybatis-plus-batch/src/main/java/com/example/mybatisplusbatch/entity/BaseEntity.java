package com.example.mybatisplusbatch.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 基础父类测试
 * </p>
 *
 * @author hubin
 * @since 2018-08-11
 */
@Data
@Accessors(chain = true)
public class BaseEntity {
    /**
     * 全局统一id设置（需要根据工程特性自定义）
     * <p>
     * 指定为用户自行填入（使用海鹚id自增组件生成，请勿使用mp自带的雪花算法）
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
}

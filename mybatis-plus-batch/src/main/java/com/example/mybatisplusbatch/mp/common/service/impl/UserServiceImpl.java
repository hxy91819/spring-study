package com.example.mybatisplusbatch.mp.common.service.impl;

import com.example.mybatisplusbatch.mp.common.entity.User;
import com.example.mybatisplusbatch.mp.common.mapper.UserMapper;
import com.example.mybatisplusbatch.mp.common.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenjing
 * @since 2020-01-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

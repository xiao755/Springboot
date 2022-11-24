package com.xxxx.seckill.service.impl;

import com.xxxx.seckill.pojo.User;
import com.xxxx.seckill.mapper.UserMapper;
import com.xxxx.seckill.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiang.zhao
 * @since 2022-11-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

package com.example.security.service;

import com.example.security.entity.SysUser;
import com.example.security.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserService {
    @Autowired
    private SysUserMapper userMapper;

    public SysUser selectById(Integer id){
        return userMapper.selectById(id);
    }

    public SysUser selectByName(String name){
        return userMapper.selectByName(name);
    }
}

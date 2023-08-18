package com.example.security.service;

import com.example.security.entity.SysUser;
import com.example.security.entity.SysUserRole;
import com.example.security.mapper.SysUserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserRoleService {
    @Autowired
    private SysUserRoleMapper userRoleMapper;

    public List<SysUserRole> listByUserId(Integer userId){
        return userRoleMapper.listByUserId(userId);
    }
}

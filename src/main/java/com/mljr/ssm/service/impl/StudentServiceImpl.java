package com.mljr.ssm.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mljr.ssm.entity.Student;
import com.mljr.ssm.mapper.student.StudentMapper;
import com.mljr.ssm.service.StudentService;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper,Student> implements StudentService {
}

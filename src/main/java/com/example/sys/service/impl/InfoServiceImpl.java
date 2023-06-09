package com.example.sys.service.impl;

import com.example.sys.entity.Info;
import com.example.sys.mapper.InfoMapper;
import com.example.sys.service.IInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 信息 服务实现类
 * </p>
 *
 * @author chris
 * @since 2023-06-07
 */
@Service
public class InfoServiceImpl extends ServiceImpl<InfoMapper, Info> implements IInfoService {

}

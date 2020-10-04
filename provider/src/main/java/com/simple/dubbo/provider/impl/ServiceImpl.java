package com.simple.dubbo.provider.impl;

import com.simple.dubbo.service.Service;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 模拟实现类
 *
 * @author wujing
 * @date 2020/9/25 13:58
 */
@DubboService
@Slf4j
public class ServiceImpl implements Service {

    @Override
    public void service() {

        log.info("service run...");
    }
}

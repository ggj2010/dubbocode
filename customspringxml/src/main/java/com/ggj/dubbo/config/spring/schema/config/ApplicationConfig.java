/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ggj.dubbo.config.spring.schema.config;

import lombok.Getter;
import lombok.Setter;
import org.slf4j.LoggerFactory;




/**
 * ApplicationConfig
 * 
 * @author william.liangf
 * @export
 */
@Getter
@Setter
public class ApplicationConfig  {

    private static final long    serialVersionUID = 5508512956753757169L;

    private String id;
    // 应用名称
    private String name;

    // 模块版本
    private String version;

    // 应用负责人
    private String owner;

    // 组织名(BU或部门)
    private String organization;

    // 分层
    private String architecture;

    // 环境，如：dev/test/run
    private String environment;

    // Java代码编译器
    private String compiler;

    // 日志输出方式
    private String logger;


    // 是否为缺省
    private Boolean isDefault;

    public ApplicationConfig() {
    }
    
    public ApplicationConfig(String name) {
        setName(name);
    }

    public  String toString(){
        return "name="+name+";owner="+owner;
    }
    

}
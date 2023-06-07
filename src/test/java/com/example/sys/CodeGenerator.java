package com.example.sys;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class CodeGenerator {
    public static void main(String[] args) {
        String url = "jdbc:mysql:///managment";
        String username = "root";
        String password = "1passworld.";
<<<<<<< HEAD
        String moduleName = "key";
=======
        String moduleName = "sys";
>>>>>>> 135851aaf8991d8c0e08ef8cc78fa810dfc65146
        String tables = "info";
        String mapperLocation = "C:\\Users\\chris\\Desktop\\demo\\src\\main\\resources\\mapper\\"+moduleName;
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("chris") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
<<<<<<< HEAD
                           // .fileOverride() // 覆盖已生成文件
=======
                            //.fileOverride() // 覆盖已生成文件
>>>>>>> 135851aaf8991d8c0e08ef8cc78fa810dfc65146
                            .outputDir("C:\\Users\\chris\\Desktop\\demo\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.example") // 设置父包名
                            .moduleName(moduleName) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, mapperLocation)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
<<<<<<< HEAD
                    builder.addInclude("info","user","role","user_role");// 设置需要生成的表名

=======
                    builder.addInclude(tables);// 设置需要生成的表名
>>>>>>> 135851aaf8991d8c0e08ef8cc78fa810dfc65146
                         //   .addTablePrefix(); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}

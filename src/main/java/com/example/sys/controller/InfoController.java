package com.example.sys.controller;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
=======
import com.example.common.vo.Result;
import com.example.sys.entity.Info;
import com.example.sys.service.IInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
>>>>>>> 135851aaf8991d8c0e08ef8cc78fa810dfc65146

/**
 * <p>
 * 信息 前端控制器
 * </p>
 *
 * @author chris
<<<<<<< HEAD
 * @since 2023-06-04
 */
@Controller
@RequestMapping("/sys/info")
public class InfoController {

=======
 * @since 2023-06-02
 */
@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private IInfoService infoService;

    @GetMapping("/all")
    public Result<List<Info>> getAllInfo() {
        List<Info> list = infoService.list();
       return Result.success(list);
    }

>>>>>>> 135851aaf8991d8c0e08ef8cc78fa810dfc65146
}

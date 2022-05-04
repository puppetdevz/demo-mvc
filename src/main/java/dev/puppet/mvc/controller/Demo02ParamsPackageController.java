package dev.puppet.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 参数封装原理
 * @author puppet
 * @since 2022/5/2 12:57
 */
@Controller
public class Demo02ParamsPackageController {
    /**
     * 演示普通的参数封装，即通过控制器方法变量名来封装
     * @param username
     * @param age
     * @return
     */
    @RequestMapping("demoSimpleParam")
    public String demoSimpleParam(String username, Integer age) {
        System.out.println("控制器方法执行了：username-" + username + ", age-" + age);
        return "success";
    }
    
    /**
     * 演示通过 @RequestParam 来进行参数封装
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("demoRequestParam")
    public String demoRequestParam(@RequestParam("username") String name, Integer age) {
        System.out.println("控制器方法demoRequestParam执行了：username-" + name + ", age-" + age);
        return "success";
    }
}

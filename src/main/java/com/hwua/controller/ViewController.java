package com.hwua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;

@Controller
@RequestMapping("/view")
public class ViewController {

    /**
     * 1. MVC访问 WEB-INF/页面
     * @param viewName 逻辑视图名
     * @return
     */
    @RequestMapping("/{view_name}")
    public String gotoWebInf(@PathVariable("view_name")String viewName){
        return viewName;
    }

    @RequestMapping("/{dir_name}/{view_name}")
    public String gotoWebInfDir(@PathVariable("dir_name")String dirName,
                                @PathVariable("view_name")String viewName){
        return dirName + File.separator + viewName;
    }

}












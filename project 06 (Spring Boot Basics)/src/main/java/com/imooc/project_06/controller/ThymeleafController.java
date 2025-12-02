package com.imooc.project_06.controller;

import lombok.extern.slf4j.Slf4j;
import org.thymeleaf.context.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.TemplateEngine;
import javax.servlet.http.HttpServletRequest;
import java.io.FileWriter;
import java.io.Writer;
import java.util.*;

@Controller//我们这里返回视图，不用 "RestController" - 表示这是一个 Spring MVC 控制器，返回的是视图名称（HTML页面），而不是 RESTful 的 JSON 数据
@Slf4j//生成一个 log 对象 - Lombok 注解，自动生成日志记录器，相当于 private static final Logger log = LoggerFactory.getLogger(ThymeleafController.class);
@RequestMapping("thyme")//加一层路由，以 thyme 开头 - 所有该控制器中的请求映射都会以 "/thyme" 作为前缀
public class ThymeleafController {
    //成员方法
    @GetMapping("hello")
    public String hello(Model model, HttpServletRequest request) {
        //准备要传递给模板的数据
        String stranger = "Jack";
        model.addAttribute("there", stranger);//将变量 stranger 的值以 "there" 为键添加到模型中，在模板中可以通过 ${there} 访问
        Date birthday = new Date();
        model.addAttribute("birthday", birthday);//将日期对象添加到模型中，在模板中可以通过 ${birthday} 访问
        Integer sex = 2;
        model.addAttribute("sex",sex);//将性别值添加到模型中，在模板中可以通过 ${sex} 访问

        //创建一个字符串列表
        List<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("HTML");
        myList.add("大数据");
        myList.add("SpringBoot");
        myList.add("微服务");
        model.addAttribute("myList", myList);//将列表添加到模型中，在模板中可以通过 ${myList} 访问和遍历

        //创建一个 Map 集合，可以存储键值对
        Map<String, Object> myMap = new HashMap<>();
        myMap.put("id", 10010);
        myMap.put("name", "Jack");
        myMap.put("sex","男");
        myMap.put("loves",myList);
        model.addAttribute("myMap", myMap);//将 Map 添加到模型中，在模板中可以通过 ${myMap} 访问

        //Servlet API 方式设置属性
        request.setAttribute("englishName", "xyzabc");//设置请求属性，只在当前请求中有效 - 将 "xyzabc" 设置为请求属性，在本次请求处理期间有效
        request.getSession().setAttribute("userToken", "colasa");//设置会话属性，在整个用户会话期间有效 - 将 "colasa" 设置为会话属性，在用户整个会话期间都有效

        return "teacher";//返回视图名称，Spring MVC 会查找名为 "teacher" 的模板文件（如 teacher.html）进行渲染
    }

    @Autowired//自动注入 Thymeleaf 模板引擎 - Spring 会自动查找并注入 TemplateEngine 的实例
    private TemplateEngine templateEngine;

    @GetMapping("createHTML")
    @ResponseBody//表示该方法返回的是响应体内容，而不是视图名称 - 直接返回字符串 "ok" 作为 HTTP 响应内容
    public String createHTML (Model model/*, HttpServletRequest request*/) throws Throwable {
        //准备数据（与 hello 方法类似，用于静态化生成 HTML）
        String stranger = "Jack";
        model.addAttribute("there", stranger);
        Date birthday = new Date();
        model.addAttribute("birthday", birthday);
        Integer sex = 2;
        model.addAttribute("sex",sex);

        //创建列表数据
        List<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("HTML");
        myList.add("大数据");
        myList.add("SpringBoot");
        myList.add("微服务");
        model.addAttribute("myList", myList);

        //创建Map数据
        Map<String, Object> myMap = new HashMap<>();
        myMap.put("id", 10010);
        myMap.put("name", "Jack");
        myMap.put("sex","男");
        myMap.put("loves",myList);
        model.addAttribute("myMap", myMap);

        //注释掉的 Servlet API 设置（在静态化中不需要，因为静态化没有 HTTP 请求上下文）
//        request.setAttribute("englishName", "xyzabc");//设置请求属性，只在当前请求中有效
//        request.getSession().setAttribute("userToken", "colasa");//设置会话属性，在整个用户会话期间有效

        //开始静态化 - 将 Thymeleaf 模板渲染成静态 HTML 文件的过程
        Context context = new Context();//创建 Thymeleaf 上下文对象，用于存储模板变量
        context.setVariable("birthday",birthday);//将生日日期设置到 Thymeleaf 上下文中
        context.setVariable("there",stranger);//将字符串变量设置到 Thymeleaf 上下文中
        context.setVariable("sex",sex);//将性别值设置到 Thymeleaf 上下文中
        context.setVariable("myList",myList);//将列表设置到 Thymeleaf 上下文中
        context.setVariable("myMap",myMap);//将 Map 设置到 Thymeleaf 上下文中

        //定义 HTML 最终保存生成的目录位置
        String path = "C:\\colasa\\Java project\\imooc-springboot-init\\Thymeleaf_HTML_Result";//指定生成 HTML 文件的保存目录
        Writer out = new FileWriter(path + "/teacher.html");//创建文件写入器，指定生成的文件名为 teacher.html
        templateEngine.process("teacher",context,out);//使用模板引擎处理模板：读取 "teacher" 模板，结合上下文数据，输出到文件
        out.close();//关闭文件写入器，确保所有数据都写入文件

        return "ok";//返回字符串 "ok" 作为 HTTP 响应，表示 HTML 生成成功
    }
}
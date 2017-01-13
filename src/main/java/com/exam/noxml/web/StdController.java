package com.exam.noxml.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.exam.noxml.service.StdService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller(value="com.exam.noxml.web.StdController")
public class StdController {

  @RequestMapping(value="/index.htm")
  public ModelAndView indexPage() {
    ModelAndView mv = new ModelAndView("index");
    return mv;
  }
  
  @Resource StdService stdService;
  
  @RequestMapping(value="/findAll.htm")
  @ResponseBody
  public String findAll() throws Exception {
    ObjectMapper objectMapper = new ObjectMapper();
    return objectMapper.writeValueAsString(stdService.findAll());
    
  }  
  
}

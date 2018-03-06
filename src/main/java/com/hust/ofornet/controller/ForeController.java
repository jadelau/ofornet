package com.hust.ofornet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.hust.ofornet.pojo.Job;
import com.hust.ofornet.service.JobService;
@Controller
@RequestMapping("")
public class ForeController {
	
	@Autowired
	JobService jobService;
	
	@RequestMapping("foresearch")
    public String search( String keyword,Model model){
        PageHelper.offsetPage(0,20);
        List<Job> job= jobService.search(keyword);
        //jobService.setSaleAndReviewNumber(ps);
        System.out.println(job);
        model.addAttribute("ps",job);
        //return "fore/searchResult";
        return "searchResult";
    }
}

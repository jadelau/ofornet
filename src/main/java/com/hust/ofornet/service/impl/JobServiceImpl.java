package com.hust.ofornet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hust.ofornet.mapper.JobMapper;
import com.hust.ofornet.pojo.Category;
import com.hust.ofornet.pojo.Company;
import com.hust.ofornet.pojo.Job;
import com.hust.ofornet.pojo.JobExample;
import com.hust.ofornet.service.CategoryService;
import com.hust.ofornet.service.CompanyService;
import com.hust.ofornet.service.JobService;

public class JobServiceImpl implements JobService {
	@Autowired
	JobMapper jobMapper;
	@Autowired
	CategoryService categoryService;
	@Autowired
	CompanyService companyService;
	@Override
	public List<Job> search(String keyword) {
		JobExample example = new JobExample();
		example.createCriteria().andNameLike("%"+keyword+"%");
		example.setOrderByClause("id desc");
		List<Job> result = jobMapper.selectByExample(example);
		setCategory(result);
		setCompany(result);
		return result;
	}
	private void setCompany(List<Job> result) {
		// TODO Auto-generated method stub
		for(Job j:result) {
			setCompany(j);
		}
	}
	
	public void setCompany(Job job) {
		Company company = companyService.get(job.getCoid());
		job.setCompany(company);
	}
	
	private void setCategory(List<Job> result) {
		// TODO Auto-generated method stub
		for(Job j:result) {
			setCategory(j);
		}
	}
	private void setCategory(Job job) {
		Category category = categoryService.get(job.getCid());
		job.setCategory(category);
	}

}

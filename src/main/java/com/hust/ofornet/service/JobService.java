package com.hust.ofornet.service;

import java.util.List;

import com.hust.ofornet.pojo.Job;

public interface JobService {

	public List<Job> search(String keyword);

}

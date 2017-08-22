package cn.zr.service;

import java.util.List;

import cn.zr.entity.Dept;

public interface DeptService {
	
	public List<Dept> findAll();
	
	public Dept findById(long id);
	
	public void add(Dept dept);
	
	public void modify(Dept dept);
	
	public void remove(Dept dept);
	
}

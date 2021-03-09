package com.shenjies88.practice.clickhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
@SpringBootApplication
public class ClickhousePracticeApplication {

	@Autowired
	private UserMapper userMapper;

	public static void main(String[] args) {
		SpringApplication.run(ClickhousePracticeApplication.class, args);
	}

	@PostMapping("/insert")
	public void insert() {
		userMapper.insert();
	}
	@PostMapping("/delete")
	public void delete() {
		userMapper.delete();
	}
	@PostMapping("/update")
	public void update() {
		userMapper.update();
	}
	@PostMapping("/list")
	public List<User> list() {
		return userMapper.listAll();
	}
}

package com.bit.springex.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
//@Service
//@Component
public class HelloDao {
	
	public void hello(){
		System.out.println("HelloDao : hello");
	}

}

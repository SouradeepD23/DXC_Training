package com.mysprhib.demo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysprhib.model.Resturant;
import com.mysprhib.resturantdao.ResturantDao;

@Controller
public class HomeController {
	
	
	@Autowired
	ResturantDao resturantDao;
	
	@RequestMapping(value = "/")
	public String home(Locale locale, Model model) {
		return "home";
	}
	
	@RequestMapping(value = "/saveRest")
	public String saveRest(@ModelAttribute Resturant resturant) {
		resturantDao.saveResturant(resturant);
		return "home";
	}
	
	
}



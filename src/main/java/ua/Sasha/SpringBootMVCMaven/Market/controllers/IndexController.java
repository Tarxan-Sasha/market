package ua.Sasha.SpringBootMVCMaven.Market.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ua.Sasha.SpringBootMVCMaven.Market.model.ReadFileExcel;
import ua.Sasha.SpringBootMVCMaven.Market.model.Test;

@Controller
public class IndexController {
	
	@GetMapping("/index")
	public String index() {
		return "index.html";
	}
	@RequestMapping("/test")
	public String testValue(Model model) {
		String[] value = new String[] {"A","B","C","D","E"}; 
		model.addAttribute("value",value);
		
		ReadFileExcel readFileExcel=new ReadFileExcel();
		//Lich
		String vOutput01=readFileExcel.ReadCellData(0, 1);
		String vOutput02=readFileExcel.ReadCellData(0, 2);
		
		model.addAttribute("vOutput01",vOutput01);
		model.addAttribute("vOutput02",vOutput02);
		//Zombie
		String vOutput11=readFileExcel.ReadCellData(1, 1);
		String vOutput12=readFileExcel.ReadCellData(1, 2);
		
		model.addAttribute("vOutput11",vOutput11);
		model.addAttribute("vOutput12",vOutput12);
		//Skelet
		String vOutput21=readFileExcel.ReadCellData(2, 1);
		String vOutput22=readFileExcel.ReadCellData(2, 2);
		
		model.addAttribute("vOutput21",vOutput21);
		model.addAttribute("vOutput22",vOutput22);
		
		return "index";
	}
	
	public void readFileExcelImplementation(){
		ReadFileExcel readFileExcel=new ReadFileExcel();//Обьект класса
		//чтение значений 2 ряд и 2 столбик
		String vOutput=readFileExcel.ReadCellData(2, 2);
		System.out.println(vOutput);
	}
	
	
	
	
	/*
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute Test test)
	{
		
		return test;
	}
	*/
}

package ua.Sasha.SpringBootMVCMaven.Market.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.*;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  

public class ReadFileExcel{
	public String ReadCellData(int vRow, int vColumn){
		String value=null;// значение для хранения ячейки значения
		Workbook wb=null;//инициализация Workbook null
		try {
			//Чтение данных из файла в виде байтов
			FileInputStream fis= new FileInputStream("E:\\Java\\проекты\\Market\\src\\main\\resources\\static\\doc\\Test.xlsx");
			//Cоздает объект XSSFWorkbook, буферизируя весь поток в памяти
			wb = new XSSFWorkbook(fis);  
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}
		
		Sheet sheet=wb.getSheetAt(0);//Получение объекта XSSFSheet по заданному индексу
		Row row=sheet.getRow(vRow);//Возвращает логичеаскую строку
		Cell cell=row.getCell(vColumn);//Получение ячейки, представляющей данный столбец
		value=cell.getStringCellValue();//Получение значения ячейки
		return value;//Возвращение значения ячейки
	}
	/*
	public static void main(String args []){
		ReadFileExcel readFileExcel=new ReadFileExcel();//Обьект класса
		//чтение значений 2 ряд и 2 столбик
		String vOutput=readFileExcel.ReadCellData(1, 2);
		System.out.println(vOutput);
	}
	*/
}

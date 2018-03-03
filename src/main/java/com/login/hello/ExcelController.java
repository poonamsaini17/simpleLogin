package com.login.hello;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.excel.ExcelReadService;
import com.login.excel.ExcelWriteService;

@RestController
public class ExcelController {
	
	
	private ExcelWriteService excelWriteService;
	
	private ExcelReadService excelReadService;

	@Autowired
	public void setExcelWriteService(ExcelWriteService excelWriteService) {
		this.excelWriteService = excelWriteService;
	}
	
	@Autowired
	   public void setExcelReadService(ExcelReadService excelReadService) {
		this.excelReadService = excelReadService;
	}




	@RequestMapping(
	            path = "/writeData")
	    @ResponseBody
	    public final void writeDataToExcel() throws IOException
	    {
		   excelWriteService.WriteToExcel();
	    }
	
	@RequestMapping(
            path = "/readData")
    @ResponseBody
    public final void readDataFromExcel() throws IOException
    {
		excelReadService.ReadExcelData();
    }

	

}

package test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Test04 {

	
	public static void main(String[] args) {
		

		String ddd = "  2018111209082233.645453  ";
		
		System.out.println("??"+ddd.trim()+"??");
	}
	
	
	public static BigDecimal toNum(String num) {
		if(null==num||"".equals(num)) {
			return new BigDecimal(0.00);
		}else {
			return new BigDecimal(num);
		}
	}
	
	
}

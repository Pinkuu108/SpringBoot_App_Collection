package in.pinku.dao;

import org.springframework.stereotype.Component;



@Component
public class ReportDao {
	public  String getNameById(Integer userId)
	{
		if(userId==100)
		{
			return "pinku";
		}
		else if(userId==101)
		{
			return "chinu";
		}
		else 
		{
			return "Name Not Found";
		}
	}

}

package in.pinku.service;

import org.springframework.stereotype.Service;

import in.pinku.dao.ReportDao;
@Service
public class Reportervice {
	
private ReportDao reportDao;


public Reportervice(ReportDao reportDao) {
	super();
	this.reportDao = reportDao;
}


public void printName(Integer userId)
{
	String nameById=reportDao.getNameById(userId);
	System.out.println(nameById);
}

}

package in.pinku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pinku.reports.IReport;

@Service
public class ReportService {
	
	@Autowired
	private IReport report;
	
   public void gererate()
   {
	   report.generateReport();
   }
}

package org.indranil.projects.MyOfficeDevelopments.appmonitor.Service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.indranil.projects.MyOfficeDevelopments.appmonitor.Service.Core.FeedCheckService;
import org.indranil.projects.MyOfficeDevelopments.appmonitor.Service.Core.LogCheckService;
import org.indranil.projects.MyOfficeDevelopments.appmonitor.Service.Core.ProcessCheckService;

public class StrategyManipulatorService {
	String[] strategies;
	ArrayList<String> results = new ArrayList<String>();
	RecordStatusUpdaterService rsus = new RecordStatusUpdaterService();
	ComparingService cs = new ComparingService();
	
	StrategyManipulatorService(){		
	}
	
	public StrategyManipulatorService(String monitoring_name,String completeStrategy, String date) throws ClassNotFoundException, SQLException{	
		if(completeStrategy.contains("+")) {
			strategies=completeStrategy.split("\\+");
		}
		else {
			strategies= new String[1];
			strategies[0] = completeStrategy;
		}
		
		for(String strategy : strategies) {
			String strategy_type  = strategy.split(":")[0];
			int strategy_type_id = Integer.parseInt(strategy.split(":")[1]);
			
			if(strategy_type.equals("FEED")) {
				FeedCheckService fcs = new FeedCheckService(monitoring_name,strategy_type_id,date);		
				results.add(fcs.feedChecker());
			}
			else if(strategy_type.equals("PROCESS")) {
				new ProcessCheckService(monitoring_name,strategy_type_id,date);				
			}
			else if(strategy_type.equals("LOG")) {
				new LogCheckService(monitoring_name,strategy_type_id,date);				
			}
			else {
				System.out.println(strategy + " Strategy is not identified");
			}
		}
			rsus.update_batch_monitoring_result(monitoring_name,cs.comparing_logic(results,strategies.length),date);		
	}

}

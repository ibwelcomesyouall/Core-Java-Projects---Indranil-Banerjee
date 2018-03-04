package org.indranil.projects.MyOfficeDevelopments.appmonitor.Service;

import java.util.ArrayList;

public class ComparingService {
	
	String final_result;

	public String comparing_logic(ArrayList<String> results, int strategy_count) {
		if(results.isEmpty() || strategy_count!=results.size())
			return null;
		else {
			for(String result: results) {
				// Write the logic to get the max timestamp
				final_result="11:00:00";
			}
			return final_result;
		}
			
			
	}

}

package com.price.finance_scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class FinanceScheduler 
{
	private static Logger logger = LoggerFactory.getLogger(FinanceScheduler.class);
	
	public static void main(String args[])
	{
		int value = 1;

		Config config = ConfigFactory.load();
		String testcase = config.getString("testcase");
		logger.error("testcase: {}", testcase);
		
		System.exit(0);
	}
}

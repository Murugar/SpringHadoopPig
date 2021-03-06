
package com.iqmsoft.hadoop.pig;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PigAppWithApacheLogs {

	private static final Log log = LogFactory.getLog(PigAppWithApacheLogs.class);

	public static void main(String[] args) throws Exception {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/spring/pig-context-apache-logs.xml", PigAppWithApacheLogs.class);
		log.info("Pig Application Running");
		context.registerShutdownHook();	


	    
	}
}

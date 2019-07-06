package com.app;

import org.apache.log4j.Logger;

public class SampleApp {
public static Logger log=Logger.getLogger(SampleApp.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
log.debug("hello");
log.info("hello");
log.warn("hello");
log.error("hello");
log.fatal("hello");
	}

}

package com.viswa.Spring;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor {
	
	public void processor() {
		System.out.println("MediaTek Processor");
	}
	
	
}

package kohgylw.QuickStart_18081J.service;

import org.springframework.stereotype.Component;

//只有带有该注解的类才会被自动包扫描
@Component
public class CompServiceImpl implements CompService {
	
	public int add(int i,int j) {
		return i+j;
	}

}

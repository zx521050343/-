package kohgylw.QuickStart_18081J.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//自动注入：直接从IOC容器中找出一个与目标类型相匹配的对象并注入到指定位置
@Component
public class PeopleAgeCountServiceImpl implements PeopleAgeCountService{
	
	@Autowired//加入这个注解以后，该属性将被自动注入，前提条件：1，被注入的对象本身必须由IOC容器；2，注入的对象也要在IOC容器中
	private CompService cs;

	public int add(int age1, int age2) {
		// TODO 自动生成的方法存根
		return cs.add(age1, age2);
	}

	public CompService getCs() {
		return cs;
	}

	public void setCs(CompService cs) {
		this.cs = cs;
	}

}

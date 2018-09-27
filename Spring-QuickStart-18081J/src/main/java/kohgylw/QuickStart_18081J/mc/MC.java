package kohgylw.QuickStart_18081J.mc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kohgylw.QuickStart_18081J.service.PeopleAgeCountService;

/**
 * 
 * <h2>基本说明</h2>
 * <p>
 * 使用一个spring框架分为3步：
 * 1,构建一个Maven项目，导入spring核心资源标签：spring-context
 * 2,去官网抄一份最基本的配置文件，并根据需求配置Bean和其中的property属性（7.2.1一节下方）。
 * （https://docs.spring.io/spring/docs/4.3.19.RELEASE/spring-framework-reference/htmlsingle/#beans-factory-metadata）
 * 3，需要用的时候，通过SpringIOC容器获得配置好的对象。
 * 
 * pom文件报错；不报错，但是使用spring框架的时候提示Class Not Found；整个项目报错——说明至少有一个资源下载失败。
 * 如何解决？
 * 1，找到你的用户目录（C盘下面的那个），找到里面的.m2文件夹。
 * 2，进入repository文件夹，根据资源的路径（按照其网址分层）找到相应的资源版本文件夹。将其删除。
 * 3，回到pom文件，重新保存一下。
 * </p>
 * @author 青阳龙野(kohgylw)
 * @version 1.0
 */
public class MC {

	public static void main(String[] args) {
		//IOC容器最基本的用法
		//第一步，新建一个IOC容器，类似于工厂
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("kohgylw/QuickStart_18081J/conf/spring.xml");
		//第二步，通过IOC容器获取对象
		//对于一个“原型”对象，每次得到的都是一个不同的对象，如果是“单例（默认）”，则每次都得到相同的对象。
		XiangShengActor x1=context.getBean("x1",XiangShengActor.class);
		System.out.println(x1.getName()+"表演"+x1.getStyle());
		System.out.println(x1.getName()+"的师傅是："+x1.getShifu().getName());
		//生成一个有参构造器对象（对于构造器有参数的对象，无法直接创建，因此，必须声明如何进行构造）
		Cat c=context.getBean("tom",Cat.class);
		System.out.println(c.getName());
		/*
		 * 除了常规的property标签赋值以外，还有一种比较偷懒的写法，使用p标签：
		 * 在beans标签中声明p命名空间xmlns:p="http://www.springframework.org/schema/p"
		 * 直接在bean标签中使用p:参数名="参数值"来赋值。
		 * 注入参数，如果必须注入一个null，则需要插入<null/>标签
		 * 
		 * 除了基本类型<value>和非基本类型<ref>意外，还可以直接对集合类进行注入，详见7.4.2
		 */
		//使用自动包扫描直接注入一个逻辑处理类
		PeopleAgeCountService cs=context.getBean(PeopleAgeCountService.class);
		System.out.println(cs.add(12, 13));
		
		//IOC额外内容：阅读官方网站第7章内的：
		//7.3 ——一个Bean容器到底是什么样的？
		//7.4 ——参数注入包括哪些更复杂的玩法
		//7.5 ——Spring除了支持“单例”、“原型”，还具备哪些作用域？
		context.close();//可选：IOC容器关闭
	}

}

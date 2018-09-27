package kohgylw.QuickStart_18081J.mc;

public class XiangShengActor {
	
	public String name;
	public String style;
	public Integer age;
	public XiangShengActor shifu;
	public String[] baocaiming;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age*2;
	}
	public XiangShengActor getShifu() {
		return shifu;
	}
	public void setShifu(XiangShengActor shifu) {
		this.shifu = shifu;
	}
	public String[] getBaocaiming() {
		return baocaiming;
	}
	public void setBaocaiming(String[] baocaiming) {
		this.baocaiming = baocaiming;
	}
}

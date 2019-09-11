package setterDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("setterDependency/beans.xml");
		BeanClass testBean=(BeanClass)context.getBean("bean");
		testBean.randomMethod();
	}

}

package com.byzx.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.byzx.model.Hello;
import com.byzx.model.Stest;
import com.byzx.model.Work;
import com.byzx.model.ZhangSan;

/**@�ļ���: Test.java
 * @�๦��˵��: 
 * @����:  ZhangXiaoTao
 * @Email: 1219016568@qq.com
 * @����: 2019��11��12������8:42:40
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����:  ZhangXiaoTao</li> 
 * 	 <li>����: 2019��11��12������8:42:40</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class Test {

	public static void main(String[] args) {
		/*ApplicationContext as=new ClassPathXmlApplicationContext("beans.xml");
		Work wk=(Work) as.getBean("Work");
		wk.doWork();*/
		
		/*ApplicationContext as=new ClassPathXmlApplicationContext("beans.xml");
		Hello he=(Hello) as.getBean("Hello");
		he.hello();*/
		
		/*Stest st=new Stest();
		st.test();*/
		
		Work wo=new Work();
		wo.setTests(new ZhangSan());
		wo.doWork();
		
	}

}

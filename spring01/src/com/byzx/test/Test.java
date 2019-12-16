package com.byzx.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.byzx.model.Hello;
import com.byzx.model.Stest;
import com.byzx.model.Work;
import com.byzx.model.ZhangSan;

/**@文件名: Test.java
 * @类功能说明: 
 * @作者:  ZhangXiaoTao
 * @Email: 1219016568@qq.com
 * @日期: 2019年11月12日上午8:42:40
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者:  ZhangXiaoTao</li> 
 * 	 <li>日期: 2019年11月12日上午8:42:40</li> 
 *	 <li>内容: </li>
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

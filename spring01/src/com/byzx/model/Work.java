package com.byzx.model;

import com.byzx.tests.Tests;

/**@文件名: work.java
 * @类功能说明: 
 * @作者:  ZhangXiaoTao
 * @Email: 1219016568@qq.com
 * @日期: 2019年11月11日下午7:24:38
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者:  ZhangXiaoTao</li> 
 * 	 <li>日期: 2019年11月11日下午7:24:38</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class Work {

	public Tests tests;

	public void setTests(Tests tests) {
		this.tests = tests;
	}

	public void doWork() {
		tests.test();
	}
	
}

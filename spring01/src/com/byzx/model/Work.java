package com.byzx.model;

import com.byzx.tests.Tests;

/**@�ļ���: work.java
 * @�๦��˵��: 
 * @����:  ZhangXiaoTao
 * @Email: 1219016568@qq.com
 * @����: 2019��11��11������7:24:38
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����:  ZhangXiaoTao</li> 
 * 	 <li>����: 2019��11��11������7:24:38</li> 
 *	 <li>����: </li>
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

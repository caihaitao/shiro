/*******************************************************************************
 * Created on 2016年4月13日 上午9:24:41
 * Copyright (c) 2014 深圳市小牛电子商务有限公司版权所有. 粤ICP备13089339号
 * 注意：本内容仅限于深圳市小牛电子商务有限公司内部传阅，禁止外泄以及用于其他商业目的!
 ******************************************************************************/
package mytest.myShiroTest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

/**
 * @author caihaitao 2016年4月13日 上午9:24:41
 */
public class ShiroHelloWord {
	public static void main(String[] args) {
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
		SecurityManager manager = factory.getInstance();
		SecurityUtils.setSecurityManager(manager);
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
		subject.login(token);
		System.out.println(subject.isAuthenticated());
	}
}

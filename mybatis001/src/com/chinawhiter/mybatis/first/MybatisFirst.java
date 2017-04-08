package com.chinawhiter.mybatis.first;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinawhiter.mybatis.po.User;

public class MybatisFirst {
	@Test
	public void findUserById() throws IOException{
		
		SqlSession sqlSession = null;
		try {
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
			sqlSession = sqlSessionFactory.openSession();
			User user = sqlSession.selectOne("test.findUserById","402881eb54564ea30154564ea4f40001");
			System.out.println("用户名："+user.getUsername());
			System.out.println(user.getCreateTime());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
	}
	@Test
	public void findUserByName(){
		SqlSession sqlSession = null;
		try {
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
			sqlSession = sqlSessionFactory.openSession();
			List<User> list = sqlSession.selectList("test.findUserByName","陈");
			for(User u:list){
				System.out.println(u.getUsername());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
	}
	@Test
	public void insertUser(){
		SqlSession sqlSession = null;
		try {
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
			sqlSession = sqlSessionFactory.openSession();
			User user = new User();
			user.setUsername("陈志鸿");
			user.setPassword("123456");
			user.setCreateTime(new Date());
			user.setExpireTime(new Date());
			sqlSession.insert("test.inserUser", user);
			sqlSession.commit();
			System.out.println("---------"+user.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
	}
	
	@Test
	public void testTest(){
		short s=1;
		
	}
}

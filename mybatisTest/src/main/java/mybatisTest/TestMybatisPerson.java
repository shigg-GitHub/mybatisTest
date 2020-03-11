package mybatisTest;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMybatisPerson {

	public static void main(String[] args) throws IOException {
		// ����mybatis�����ļ���Ϊ�˷������ݿ⣩
		Reader reader=Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
		//SqlSession �൱��connect
		SqlSession session= sessionFactory.openSession();
		//Person p1=new Person();
		Person person=session.selectOne("mybatisTest.PersonMapper.selectPersonById",2);
		System.out.println(person.toString());
	}

}

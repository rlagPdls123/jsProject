package kr.or.ddit.user.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.user.model.User;
import kr.or.ddit.util.MybatisUtil;

public class UserDao implements IUserDao{

   /**
    * Method : getUserList
    * 작성자 : PC-11
    * 변경이력 :
    * @return
    * Method 설명 :
    */
   @Override
   public List<User> getUserList() {
      
      // db에서 조회가 되었다고 가정하고 가짜 객체를 리턴
//      List<User> userList = new ArrayList<User>();
//      userList.add(new User("brown"));
//      userList.add(new User("cony"));
//      userList.add(new User("sally"));
      
	  SqlSession sqlSession = MybatisUtil.getSession();
	  List<User> userList = sqlSession.selectList("user.getUserList");
	  sqlSession.close();
	   
      return userList;
   }
   /**
    * 
   * Method : getUser
   * 작성자 : PC-25
   * 변경이력 :
   * @param userId
   * @return
   * Method 설명 :
    */
@Override
public User getUser(String userId) {
	SqlSession sqlSession = MybatisUtil.getSession();
	User uservo = sqlSession.selectOne("user.getUser", userId);
	sqlSession.close();
	return uservo;
}

   
}
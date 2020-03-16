package xyz.devyu.security.service;
//package xyz.devyu.security.repository;
//
//import java.util.List;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
//import org.springframework.stereotype.Repository;
//
//import xyz.devyu.security.domain.Member;
//
//@Repository
//public class MemberRepository extends JdbcDaoImpl{
////
////	/**
////	 * @작성자 : 장민규(devyu)
////	 * @메서드설명 : 사용자의 아이디를 파라미터로 넘겨 UserDetails 객체를 리턴 받음
////	 * 계정클래스인 Member 클래스가 UserDetails 인터페이스를 구현하고 있으니
////	 * Member 클래스를 리턴할 수 있음.
////    */
////	@Override
////	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////		
////		List<UserDetails> list = (List<UserDetails>) loadUserByUsername(username);
////		
////		Member merber = (Member) list.get(0);
////		
////		return merber;
////	}
////	
//	@Override
//	protected List<UserDetails> loadUsersByUsername(String username) {
//		// TODO Auto-generated method stub
//		return super.loadUsersByUsername(username);
//	}
//}

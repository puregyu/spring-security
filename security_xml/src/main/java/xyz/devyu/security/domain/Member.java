package xyz.devyu.security.domain;

import java.util.Collection;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @작성자 : 장민규(devyu)
 * @클래스설명 : security에서 제공하는 UserDetails 인터페이스를 구현한 사용자 계정 클래스
*/
@Entity
public class Member implements UserDetails{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String userId;
	private String userPassword;
	private Set<GrantedAuthority> authorities;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public void setAuthorities(Set<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	/**
	 * @작성자 : 장민규(devyu)
	 * @메서드설명 : 계정이 가지고 있는 권한 목록을 리턴
    */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}
	
	/**
	 * @작성자 : 장민규(devyu)
	 * @메서드설명 : 계정의 아이디를 리턴
    */
	@Override
	public String getUsername() {
		return getUserId();
	}
	
	/**
	 * @작성자 : 장민규(devyu)
	 * @메서드설명 : 계정의 비밀번호를 리턴
    */
	@Override
	public String getPassword() {
		return getUserPassword();
	}
	
	/**
	 * @작성자 : 장민규(devyu)
	 * @메서드설명 : 계정이 만료되었는지 확인 여부 
	 * @return true - 계정 사용 가능
	 * @return false - 계정 사용 만료
    */
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	
	/**
	 * @작성자 : 장민규(devyu)
	 * @메서드설명 : 계정이 잠겨있는지 확인 여부 
	 * @return true - 계정 사용 가능
	 * @return false - 계정 사용 잠금
    */
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	
	/**
	 * @작성자 : 장민규(devyu)
	 * @메서드설명 : 계정의 패스워드가 만료되었는지 확인 여부
	 * @return true - 계정 사용 가능
	 * @return false - 계정 패스워드 만료
    */
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	/**
	 * @작성자 : 장민규(devyu)
	 * @메서드설명 : 계정의 패스워드가 만료되었는지 확인 여부
	 * @return true - 계정 사용 가능
	 * @return false - 계정 사용 불가
    */
	@Override
	public boolean isEnabled() {
		return true;
	}

	
	
}

package co.soyeon.hello.notice.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeVO {
	private String no;
	private String id;
	private String name;
	private Date wdate;
	private String title;
	private String subject;
	private String fileName;
	private String pfileName; // 물리파일명
	
	private int bigo;
	
	// 여기에다 필요 시 확장하기

}

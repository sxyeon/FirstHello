package co.soyeon.hello.notice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.soyeon.hello.notice.service.NoticeMapper;
import co.soyeon.hello.notice.service.NoticeService;
import co.soyeon.hello.notice.service.NoticeVO;

@Repository("noticeDao") // IoC에 레파지토리로 등록함 
// @Service("noticeDao) // 이것도 됨
// @Component("noticeDao") // 이것도 됨 
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeMapper map;
	
	@Override
	public List<NoticeVO> noticeSelectList() {
		return map.noticeSelectList();
	}

	@Override
	public NoticeVO noticeSelect(NoticeVO vo) {
		return map.noticeSelect(vo);
	}

	@Override
	public int noticeInsert(NoticeVO vo) {
		return map.noticeInsert(vo);
	}

	@Override
	public int noticeUpdate(NoticeVO vo) {
		return map.noticeUpdate(vo);
	}

	@Override
	public int noticeDelete(NoticeVO vo) {
		return map.noticeDelete(vo);
	}

	@Override
	public List<NoticeVO> noticeSearchList(String searchKey) {
		return map.noticeSelectList();
	}

}

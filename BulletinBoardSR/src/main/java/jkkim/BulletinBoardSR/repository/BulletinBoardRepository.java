/// Entity에 의해 생성된 DB에 접근하는 메서드를 사용하기 위한 인터페이스
// DB연결, 해제, 자원관리, CRUD를 처리

package jkkim.BulletinBoardSR.repository;

import jkkim.BulletinBoardSR.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BulletinBoardRepository extends JpaRepository<Article, Integer> { // Entity 클래스와 프라이머리 키의 자료형 입력




}

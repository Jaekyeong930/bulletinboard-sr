// 사용자의 요구사항을 처리함
// 요청에 따라 어떤 처리를 할 지 결정
// DB데이터가 필요할 때는 Repository에 요청
// 대규모 프로젝트일수록 Service 내용이 많아짐

package jkkim.BulletinBoardSR.service;


import jkkim.BulletinBoardSR.entity.Article;
import jkkim.BulletinBoardSR.repository.BulletinBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BulletinBoardService {

    @Autowired // 스프링 컨테이너에 등록한 빈에 의존성 주입이 필요할 때, DI(Dependency Injection)을 도움
    private BulletinBoardRepository boardRepository;


    public void write(Article article) {

        boardRepository.save(article);
    }


}

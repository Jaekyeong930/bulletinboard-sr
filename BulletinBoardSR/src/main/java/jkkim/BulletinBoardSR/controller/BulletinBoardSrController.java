package jkkim.BulletinBoardSR.controller;


import jkkim.BulletinBoardSR.entity.Article;
<<<<<<< HEAD
import jkkim.BulletinBoardSR.service.BulletinBoardService;
import org.springframework.beans.factory.annotation.Autowired;
=======
>>>>>>> ef108def441884d7961bcd8bdeb9cc782de6a9bc
import org.springframework.stereotype.Controller;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BulletinBoardSrController {

<<<<<<< HEAD

    @Autowired // 컨트롤러 입장에서 보드서비스가 무슨 역할인지 알 수 없기 때문에 의존성 주입!
    private BulletinBoardService bulletinBoardService;


=======
>>>>>>> ef108def441884d7961bcd8bdeb9cc782de6a9bc
    @GetMapping("/board/write") // localhost:8080/board/write 주소로 접속하면 해당 페이지 출력
    public String boardWriteForm() {

        return "bulletinboard_write";
    }

    @PostMapping("/board/write_process")
    public String boardWriteProcess(Article article) { // 변수명은 html 파일과 동일하게

<<<<<<< HEAD
        bulletinBoardService.write(article); // 맨앞글자 소문자로 쓰는 이유는?

=======

        System.out.println(article.getArticle_title());
        System.out.println(article.getArticle_content());
>>>>>>> ef108def441884d7961bcd8bdeb9cc782de6a9bc
        return "";
    }
}

package jkkim.BulletinBoardSR.controller;


import jkkim.BulletinBoardSR.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BulletinBoardSrController {

    @GetMapping("/board/write") // localhost:8080/board/write 주소로 접속하면 해당 페이지 출력
    public String boardWriteForm() {

        return "bulletinboard_write";
    }

    @PostMapping("/board/write_process")
    public String boardWriteProcess(Article article) { // 변수명은 html 파일과 동일하게


        System.out.println(article.getArticle_title());
        System.out.println(article.getArticle_content());
        return "";
    }
}

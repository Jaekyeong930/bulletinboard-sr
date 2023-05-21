package jkkim.BulletinBoardSR.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BulletinBoardSrController {

    @GetMapping("/board/write") // localhost:8080/board/write 주소로 접속하면 해당 페이지 출력
    public String boardWriteForm() {

        return "bulletinboard_write";
    }
}

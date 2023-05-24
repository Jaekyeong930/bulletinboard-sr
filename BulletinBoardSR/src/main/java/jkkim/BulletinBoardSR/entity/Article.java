// DTO class

package jkkim.BulletinBoardSR.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "article")
@Data // 컨트롤러가 데이터를 가져올 수 있게 자동으로 get 함수를 생성해줌!
public class Article { // 테이블 명으로 지정해야함

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identity는 mysql과 mariaDB, SEQUENCE는 오라클, Auto는 알아서 지정
    private Integer article_id;
    private String article_title;

    private String article_content;


    private Integer member_nid;

    private Integer article_writer;

}

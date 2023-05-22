// DTO class

package jkkim.BulletinBoardSR.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "member")
@Data
public class Member {
// 모든 '@Entity' 클래스는 하나 이상의 '@Id' 또는 '@EmbeddedId' 속성을 선언하거나 상속해야 함
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer member_nid;

    private String member_id;

    private String member_pw;
    private String member_name;
    private String member_address;

}

package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

/**
* Getter, Setter 생성법 1
* Lombok 이용시에는 @Getter @Setter와 같이 어노테이션 방법으로 생성할 수 있음.
*/
@Getter @Setter
public class HelloData {
    private String username;
    private int age;

/**
 * Getter, Setter 생성법 2
 * Lombok 이용하지 않을 경우에는 아래와 같은 방법으로 생성할 수 있음.
 * Getter and Setter 단축키 =  alt + ins

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
*/
}

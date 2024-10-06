package efub.assignment.community.post.domain;

import efub.assignment.community.account.domain.Account;
import efub.assignment.community.account.dto.SignUpRequestDto;
import efub.assignment.community.account.repository.AccountRepository;
import efub.assignment.community.board.domain.Board;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PostTest {

    private Account testAccount;
    private Board testBoard;

    @BeforeEach
    void testAccount_persist_setUp() {
        // 테스트를 위한 Account 인스턴스 생성
        String email = "email@domain.com";
        String password = "password";
        String nickname = "사용자명";
        String university = "Test Univ.";
        String studentId = "1234";

        Account account = Account.builder()
                .email(email)
                .password(password)
                .nickname(nickname)
                .university(university)
                .studentId(studentId)
                .build();
        testAccount = account;
    }

    @Order(1)
    @Test
    void post_build_test() {
        // given
    }
}
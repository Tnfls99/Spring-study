package hello.hellospring.Repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long Id);
    Optional<Member> findMyName(String name);
    List<Member> findAll();
}

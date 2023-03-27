package hello.core.member;

//비지니스 로직 제작
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}

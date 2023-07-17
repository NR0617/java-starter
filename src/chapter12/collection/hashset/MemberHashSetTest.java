package chapter12.collection.hashset;

import chapter12.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();
        Member memberHong = new Member(101, "홍홍");
        Member memberKim = new Member(102, "킴킴");
        Member memberGang = new Member(103, "캉캉");
        memberHashSet.addMember(memberHong);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberGang);

        Member memberGang2 = new Member(103, "캉캉"); // 아이디 중복 방지는 Member에 만들어야된다
        memberHashSet.addMember(memberGang2);

        memberHashSet.showAll();

    }
}

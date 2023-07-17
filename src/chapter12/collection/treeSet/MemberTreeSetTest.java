package chapter12.collection.treeSet;

import chapter12.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberHashSet = new MemberTreeSet();
        Member memberHong = new Member(102, "홍홍");
        Member memberKim = new Member(101, "킴킴");
        Member memberGang = new Member(103, "캉캉");
        memberHashSet.addMember(memberHong);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberGang);

        Member memberGang2 = new Member(103, "캉캉"); // 아이디 중복 방지는 Member에 만들어야된다
        memberHashSet.addMember(memberGang2);

        memberHashSet.showAll();

    }
}

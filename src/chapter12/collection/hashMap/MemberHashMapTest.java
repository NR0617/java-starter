package chapter12.collection.hashMap;

import chapter12.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();
        Member memberHong = new Member(102, "홍홍");
        Member memberKim = new Member(101, "킴킴");
        Member memberGang = new Member(103, "캉캉");
        memberHashMap.addMember(memberHong);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberGang);

        Member memberGang2 = new Member(103, "캉캉"); // 아이디 중복 방지는 Member에 만들어야된다
        memberHashMap.addMember(memberGang2);

        memberHashMap.showAllMember();
        System.out.println();

        memberHashMap.removeMember(102);
        memberHashMap.showAllMember();


    }
}

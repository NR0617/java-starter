package chapter12.collection.arraylist;

import chapter12.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList members = new MemberArrayList();

        Member memberHong = new Member(101, "홍홍");
        Member memberKim = new Member(102, "킴킴");
        Member memberGang = new Member(103, "캉캉");

        members.addMember(memberHong);
        members.addMember(memberKim);
        members.addMember(memberGang);

        members.showAll();

        members.removeMember(memberHong.getMemberId());
        members.showAll();

    }
}

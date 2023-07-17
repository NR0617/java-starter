package chapter12.collection.treeMap;

import chapter12.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();
        Member memberHong = new Member(102, "홍홍");
        Member memberKim = new Member(101, "킴킴");
        Member memberGang = new Member(103, "캉캉");
        memberTreeMap.addMember(memberHong);
        memberTreeMap.addMember(memberKim);
        memberTreeMap.addMember(memberGang);

        Member memberGang2 = new Member(103, "캉캉");
        memberTreeMap.addMember(memberGang2);

        memberTreeMap.showAllMember();
//        System.out.println();
//
//        memberTreeMap.removeMember(102);
//        memberTreeMap.showAllMember();


    }
}

package chapter12.collection.hashMap;

import chapter12.collection.Member;

import java.util.HashMap;
import java.util.Iterator;


public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;
    public MemberHashMap() {
        hashMap = new HashMap<Integer, Member>();
    }
    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);

    }
    public boolean removeMember(int memberId) {
        if(hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }
        System.out.println(memberId + "번 회원님이 존재하지않습니다.");
        return false;
    }
    public void showAllMember() {
        Iterator<Integer> ir = hashMap.keySet().iterator();

        while (ir.hasNext()) {
            int key = ir.next();

            Member member = hashMap.get(key);
            System.out.println(member);
        }
    }


}

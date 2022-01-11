package chapter12.collection.treeset;

import chapter12.collection.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();

		Member memberPark = new Member(1003, "¹Ú¼­ÈÍ");
		Member memberLee = new Member(1001, "ÀÌÁö¿ø");
		Member memberSon = new Member(1002, "¼Õ¹Î±¹");

		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.showAllMember();

		Member memberHong = new Member(1003, "È«±æµ¿");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}

}

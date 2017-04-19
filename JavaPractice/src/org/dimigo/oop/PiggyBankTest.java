package org.dimigo.oop;

public class PiggyBankTest {

	public static void main(String[] args) {
		FamilyMember 아빠 = new FamilyMember("아빠");
		FamilyMember 엄마 = new FamilyMember("엄마");
		FamilyMember 나 = new FamilyMember("나");
		FamilyMember 남동생 = new FamilyMember("동생");
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(아빠, 10000);
		PiggyBank.putMoney(엄마, 5000);
		PiggyBank.putMoney(나, 2000);
		PiggyBank.putMoney(남동생, 1000);
		PiggyBank.printBalance();
		PiggyBank.putMoney(나, 1000);
		PiggyBank.printBalance();

	}

}

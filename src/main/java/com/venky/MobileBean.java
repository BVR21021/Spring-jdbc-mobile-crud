package com.venky;

import org.springframework.jdbc.core.JdbcTemplate;

public class MobileBean {
	private JdbcTemplate jt;

	@Override
	public String toString() {
		return "AdditonBean [jt=" + jt + "]";
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public void create() {
		jt.execute(
				"create table mobile(modelNo number(38),mobileName varchar2(40),ramSize number(38),osName varchar2(40),processorName varchar2(40),companyName varchar2(40),price number(10,2),warrenty varchar2(40),fCamSize varchar2(40),bCamSize varchar2(40),imeiNo number(38))");
		System.out.println("table created..");
	}

	public void insert() {
		int i = jt.update(
				"insert into mobile values(12334567,'samsung',3,'andriod','aquapro','samsung',12345,'1year','12mp','64mp',123456778)");
		System.out.print(i + "new record inserted......");
	}

	public void update() {
		int i = jt.update("update mobile set osname='lollypop',price=30000 where modelNo=12334567");
		System.out.println(i + "updated");
	}

	public void delete() {
		int i = jt.update("delete from mobile where modelno=12334567");
		System.out.println(i + "deleted");
	}

}

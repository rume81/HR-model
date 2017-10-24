package com.webhawks.Hawks_model;

import org.apache.commons.lang3.StringEscapeUtils;


public class HEmployee extends HObject {
	private Integer emp_id;
	private String employee_name;
	private String avator;
	private String email;
	private String designation;
	private String skype_id;
	private String bloodgroup;
	private String birthdate_certificate;
	private String birthdate_real;
	private String nid;
	private String personal_email;
	private String password;
	private String usertype;
	private String mobile;
	private String emp_number;
	private Integer teamId;
	private String join_date;
	
	private String first_name;
	private String last_name;
	private String designation2;
	private String refferal_no;
	private String prv_work_place;
	private String rpt_mgr;
	private String present_address;
	private String permanent_address;
	private String about_me;
	private String office_location;
	private String passport;
	private String maritial_status;
	private Integer no_siblings;
	private String hobbies;
	private String extra_activitie;
	private String zodiac;
	private String sign;
	private String bank_acc_no;
	private String offical_phone;
	private String extension;
	private String emergency_phone;
	private String relation;
	private String company;
	private String department;
	private String official_mail;
	private String education;
	private String bank_name;
	private String chat_nick;
	private HUpload profPic;
	private HUpload appointment;
	private HUpload nda;
	
	
	public HEmployee(){
	
	}
	public HEmployee(Integer emp_id){
	    emp_id = emp_id;
	}
	public Integer getEmp_id() {
	    return emp_id;
	}
	public void setEmp_id(Integer emp_id) {
	    this.emp_id = emp_id;
	}
	public String getEmployee_name() {
	    return employee_name;
	}
	public void setEmployee_name(String employee_name) {
	    this.employee_name = employee_name;
	}
	public String getAvator() {
	    return avator;
	}
	public void setAvator(String avator) {
	    this.avator = avator;
	}
	public String getEmail() {
	    return email;
	}
	public void setEmail(String email) {
	    this.email = email;
	}
	public String getDesignation() {
	    return designation;
	}
	public void setDesignation(String designation) {
	    this.designation = designation;
	}
	public String getSkype_id() {
	    return skype_id;
	}
	public void setSkype_id(String skype_id) {
	    this.skype_id = skype_id;
	}
	public String getBloodgroup() {
	    return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
	    this.bloodgroup = bloodgroup;
	}
	public String getBirthdate_certificate() {
	    return birthdate_certificate;
	}
	public void setBirthdate_certificate(String birthdate_certificate) {
	    this.birthdate_certificate = birthdate_certificate;
	}
	public String getBirthdate_real() {
	    return birthdate_real;
	}
	public void setBirthdate_real(String birthdate_real) {
	    this.birthdate_real = birthdate_real;
	}
	public String getNid() {
	    return nid;
	}
	public void setNid(String nid) {
	    this.nid = nid;
	}
	public String getPersonal_email() {
	    return personal_email;
	}
	public void setPersonal_email(String personal_email) {
	    this.personal_email = personal_email;
	}
	public String getPassword() {
	    return password;
	}
	public void setPassword(String password) {
	    this.password = password;
	}
	public String getUsertype() {
	    return usertype;
	}
	public void setUsertype(String usertype) {
	    this.usertype = usertype;
	}
	public String getMobile() {
	    return mobile;
	}
	public void setMobile(String mobile) {
	    this.mobile = mobile;
	}
	public String getEmp_number() {
	    return emp_number;
	}
	public void setEmp_number(String emp_number) {
	    this.emp_number = emp_number;
	}
	
	public Integer getTeamId() {
	    return teamId;
	}
	public void setTeamId(Integer teamId) {
	    this.teamId = teamId;
	}
	
	public String getJoin_date() {
	    return join_date;
	}
	public void setJoin_date(String join_date) {
	    this.join_date = join_date;
	}
	
	public String getFirst_name() {
	    return first_name;
	}
	public void setFirst_name(String first_name) {
	    this.first_name = first_name;
	}
	public String getLast_name() {
	    return last_name;
	}
	public void setLast_name(String last_name) {
	    this.last_name = last_name;
	}
	public String getRefferal_no() {
	    return refferal_no;
	}
	public void setRefferal_no(String refferal_no) {
	    this.refferal_no = refferal_no;
	}
	public String getPrv_work_place() {
	    return prv_work_place;
	}
	public void setPrv_work_place(String prv_work_place) {
	    this.prv_work_place = prv_work_place;
	}
	public String getRpt_mgr() {
	    return rpt_mgr;
	}
	public void setRpt_mgr(String rpt_mgr) {
	    this.rpt_mgr = rpt_mgr;
	}
	public String getPresent_address() {
	    return present_address;
	}
	public void setPresent_address(String present_address) {
	    this.present_address = present_address;
	}
	public String getPermanent_address() {
	    return permanent_address;
	}
	public void setPermanent_address(String permanent_address) {
	    this.permanent_address = permanent_address;
	}
	public String getAbout_me() {
	    return about_me;
	}
	public void setAbout_me(String about_me) {
	    this.about_me = about_me;
	}
	public String getOffice_location() {
	    return office_location;
	}
	public void setOffice_location(String office_location) {
	    this.office_location = office_location;
	}
	public String getPassport() {
	    return passport;
	}
	public void setPassport(String passport) {
	    this.passport = passport;
	}
	public String getMaritial_status() {
	    return maritial_status;
	}
	public void setMaritial_status(String maritial_status) {
	    this.maritial_status = maritial_status;
	}
	public Integer getNo_siblings() {
	    return no_siblings;
	}
	public void setNo_siblings(Integer no_siblings) {
	    this.no_siblings = no_siblings;
	}
	public String getHobbies() {
	    return hobbies;
	}
	public void setHobbies(String hobbies) {
	    this.hobbies = hobbies;
	}
	public String getExtra_activitie() {
	    return extra_activitie;
	}
	public void setExtra_activitie(String extra_activitie) {
	    this.extra_activitie = extra_activitie;
	}
	public String getZodiac() {
	    return zodiac;
	}
	public void setZodiac(String zodiac) {
	    this.zodiac = zodiac;
	}
	public String getSign() {
	    return sign;
	}
	public void setSign(String sign) {
	    this.sign = sign;
	}
	public String getBank_acc_no() {
	    return bank_acc_no;
	}
	public void setBank_acc_no(String bank_acc_no) {
	    this.bank_acc_no = bank_acc_no;
	}
	public String getOffical_phone() {
	    return offical_phone;
	}
	public void setOffical_phone(String offical_phone) {
	    this.offical_phone = offical_phone;
	}
	public String getExtension() {
	    return extension;
	}
	public void setExtension(String extension) {
	    this.extension = extension;
	}
	public String getEmergency_phone() {
	    return emergency_phone;
	}
	public void setEmergency_phone(String emergency_phone) {
	    this.emergency_phone = emergency_phone;
	}
	public String getRelation() {
	    return relation;
	}
	public void setRelation(String relation) {
	    this.relation = relation;
	}
	
	public String getDesignation2() {
		return designation2;
	}
	public void setDesignation2(String designation2) {
		this.designation2 = designation2;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getOfficial_mail() {
		return official_mail;
	}
	public void setOfficial_mail(String official_mail) {
		this.official_mail = official_mail;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getChat_nick() {
		return chat_nick;
	}
	public void setChat_nick(String chat_nick) {
		this.chat_nick = chat_nick;
	}
	public HUpload getProfPic() {
	    return profPic;
	}
	public void setProfPic(HUpload profPic) {
	    this.profPic = profPic;
	}
	public HUpload getAppointment() {
	    return appointment;
	}
	public void setAppointment(HUpload appointment) {
	    this.appointment = appointment;
	}
	public HUpload getNda() {
	    return nda;
	}
	public void setNda(HUpload nda) {
	    this.nda = nda;
	}
	public void escapeEcmaScript()
	{
	    employee_name = StringEscapeUtils.escapeEcmaScript(employee_name);
	    avator = StringEscapeUtils.escapeEcmaScript(avator);
	    email = StringEscapeUtils.escapeEcmaScript(email);
	    designation = StringEscapeUtils.escapeEcmaScript(designation);
	    skype_id = StringEscapeUtils.escapeEcmaScript(skype_id);
	    birthdate_certificate = StringEscapeUtils.escapeEcmaScript(birthdate_certificate);
	    nid = StringEscapeUtils.escapeEcmaScript(nid);
	    personal_email = StringEscapeUtils.escapeEcmaScript(personal_email);
	    password = StringEscapeUtils.escapeEcmaScript(password);
	    mobile = StringEscapeUtils.escapeEcmaScript(mobile);
	    emp_number = StringEscapeUtils.escapeEcmaScript(emp_number);
	    join_date = StringEscapeUtils.escapeEcmaScript(join_date);
	    
	    first_name = StringEscapeUtils.escapeEcmaScript(first_name);
	    last_name = StringEscapeUtils.escapeEcmaScript(last_name);
	    refferal_no = StringEscapeUtils.escapeEcmaScript(refferal_no);
	    prv_work_place = StringEscapeUtils.escapeEcmaScript(prv_work_place);
	    rpt_mgr = StringEscapeUtils.escapeEcmaScript(rpt_mgr);
	    present_address = StringEscapeUtils.escapeEcmaScript(present_address);
	    permanent_address = StringEscapeUtils.escapeEcmaScript(permanent_address);
	    about_me = StringEscapeUtils.escapeEcmaScript(about_me);
	    office_location = StringEscapeUtils.escapeEcmaScript(office_location);
	    passport = StringEscapeUtils.escapeEcmaScript(passport);
	    maritial_status = StringEscapeUtils.escapeEcmaScript(maritial_status);
	    hobbies = StringEscapeUtils.escapeEcmaScript(hobbies);
	    extra_activitie = StringEscapeUtils.escapeEcmaScript(extra_activitie);
	    zodiac = StringEscapeUtils.escapeEcmaScript(zodiac);
	    sign = StringEscapeUtils.escapeEcmaScript(sign);
	    bank_acc_no = StringEscapeUtils.escapeEcmaScript(bank_acc_no);
	    offical_phone = StringEscapeUtils.escapeEcmaScript(offical_phone);
	    extension = StringEscapeUtils.escapeEcmaScript(extension);
	    emergency_phone = StringEscapeUtils.escapeEcmaScript(emergency_phone);
	    relation = StringEscapeUtils.escapeEcmaScript(relation);
	}
}

package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HEmployee;
import com.webhawks.Hawks_model.HUpload;

public class EmpMapper extends BaseMapper implements RowMapper<HEmployee> {

    public HEmployee mapRow(ResultSet rs, int rowNum) throws SQLException {
	HEmployee emp = new HEmployee();
	
	int colindex = 0;
	
	colindex = findColumn(rs, "emp_id");
	if (colindex > 0) {
	    emp.setEmp_id(rs.getInt(colindex));
	}

	colindex = findColumn(rs, "employee_name");
	if (colindex > 0) {
	    emp.setEmployee_name(rs.getString(colindex));
	}

	colindex = findColumn(rs, "avator");
	if (colindex > 0) {
	    emp.setAvator(rs.getString(colindex));
	}

	colindex = findColumn(rs, "email");
	if (colindex > 0) {
	    emp.setEmail(rs.getString(colindex));
	}

	colindex = findColumn(rs, "designation");
	if (colindex > 0) {
	    emp.setDesignation(rs.getString(colindex));
	}

	colindex = findColumn(rs, "skype_id");
	if (colindex > 0) {
	    emp.setSkype_id(rs.getString(colindex));
	}

	colindex = findColumn(rs, "bloodgroup");
	if (colindex > 0) {
	    emp.setBloodgroup(rs.getString(colindex));

	}

	colindex = findColumn(rs, "birthdate_certificate");
	if (colindex > 0) {
	    Date bcd = rs.getDate(colindex);
	    if (null != bcd)
		emp.setBirthdate_certificate(DateFormate().format(bcd));
	    else
		emp.setBirthdate_certificate("");

	}

	colindex = findColumn(rs, "birthdate_real");
	if (colindex > 0) {
	    Date brd = rs.getDate(colindex);
	    if (null != brd)
		emp.setBirthdate_real(DateFormate().format(brd));
	    else
		emp.setBirthdate_real("");
	}

	colindex = findColumn(rs, "nid");
	if (colindex > 0) {
	    emp.setNid(rs.getString(colindex));
	}

	colindex = findColumn(rs, "personal_email");
	if (colindex > 0) {
	    emp.setPersonal_email(rs.getString(colindex));
	}

	colindex = findColumn(rs, "password");
	if (colindex > 0) {
	    emp.setPassword(rs.getString(colindex));
	}

	colindex = findColumn(rs, "usertype");
	if (colindex > 0) {
	    emp.setUsertype(rs.getString(colindex));
	}

	colindex = findColumn(rs, "mobile");
	if (colindex > 0) {
	    emp.setMobile(rs.getString(colindex));
	}

	colindex = findColumn(rs, "deleted");
	if (colindex > 0) {
	    emp.setDeleted(rs.getBoolean(colindex));
	}

	colindex = findColumn(rs, "modifierid");
	if (colindex > 0) {
	    emp.setModId(rs.getString(colindex));
	}

	colindex = findColumn(rs, "emp_number");
	if (colindex > 0) {
	    emp.setEmp_number(rs.getString(colindex));
	}

	colindex = findColumn(rs, "teamId");
	if (colindex > 0) {
	    emp.setTeamId(rs.getInt(colindex));
	}

	colindex = findColumn(rs, "join_date");
	if (colindex > 0) {
	    Date jod = rs.getDate(colindex);
	    if (null != jod)
		emp.setJoin_date(DateFormate().format(jod));
	    else
		emp.setJoin_date("");
	}
	
	colindex = findColumn(rs, "fname");
	if (colindex > 0) {
	    emp.setFirst_name(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "lname");
	if (colindex > 0) {
	    emp.setLast_name(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "secondary_designation");
	if (colindex > 0) {
	    emp.setDesignation2(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "company");
	if (colindex > 0) {
	    emp.setCompany(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "department");
	if (colindex > 0) {
	    emp.setDepartment(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "referral");
	if (colindex > 0) {
	    emp.setRefferal_no(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "previous_work");
	if (colindex > 0) {
	    emp.setPrv_work_place(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "reporting_manager");
	if (colindex > 0) {
	    emp.setRpt_mgr(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "education");
	if (colindex > 0) {
	    emp.setEducation(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "passport");
	if (colindex > 0) {
	    emp.setPassport(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "maritial_status");
	if (colindex > 0) {
	    emp.setMaritial_status(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "siblings");
	if (colindex > 0) {
	    emp.setNo_siblings(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "hobbies");
	if (colindex > 0) {
	    emp.setHobbies(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "extra_activitie");
	if (colindex > 0) {
	    emp.setExtra_activitie(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "emergency_phone");
	if (colindex > 0) {
	    emp.setEmergency_phone(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "relation");
	if (colindex > 0) {
	    emp.setRelation(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "zodiac");
	if (colindex > 0) {
	    emp.setZodiac(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "bank_name");
	if (colindex > 0) {
	    emp.setBank_name(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "bank_account");
	if (colindex > 0) {
	    emp.setBank_acc_no(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "offical_phone");
	if (colindex > 0) {
	    emp.setOffical_phone(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "extension");
	if (colindex > 0) {
	    emp.setExtension(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "office_chat");
	if (colindex > 0) {
	    emp.setChat_nick(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "present_address");
	if (colindex > 0) {
	    emp.setPresent_address(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "permanent_address");
	if (colindex > 0) {
	    emp.setPermanent_address(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "about_me");
	if (colindex > 0) {
	    emp.setAbout_me(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "profile_picture");
	if (colindex > 0) {
	    HUpload prp = new HUpload();
	    prp.setPath(rs.getString(colindex));
	    emp.setProfPic(prp);
	}
	
	colindex = findColumn(rs, "appointment_letter");
	if (colindex > 0) {
	    HUpload apl = new HUpload();
	    apl.setPath(rs.getString(colindex));
	    emp.setAppointment(apl);
	}
	
	colindex = findColumn(rs, "nda");
	if (colindex > 0) {
	    HUpload nda = new HUpload();
	    nda.setPath(rs.getString(colindex));
	    emp.setNda(nda);
	}
	
	colindex = findColumn(rs, "jobtitle");
	if (colindex > 0) {
	    emp.setJobtitle(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "jobnature");
	if (colindex > 0) {
	    emp.setJobnature(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "workstation");
	if (colindex > 0) {
	    emp.setWorkstation(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "responsiblefor");
	if (colindex > 0) {
	    emp.setResponsiblefor(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "probation_period");
	if (colindex > 0) {
	    emp.setProbation_period(rs.getString(colindex));
	}
	
	
	colindex = findColumn(rs, "job_desc");
	if (colindex > 0) {
	    emp.setJob_desc(rs.getString(colindex));
	}
	
	return emp;
    }

}

package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HMail;


/**
 * @author OS-10 Monsur
 *
 */
public class MailMapper extends BaseMapper implements RowMapper<HMail> {
    public HMail mapRow(ResultSet rs, int rowNum) throws SQLException {
	HMail mail = new HMail();
	
	if (findColumnNames(rs, "mail_id")) {
	    mail.setMail_id(rs.getInt("mail_id"));
	}
	
	if (findColumnNames(rs, "mail_from")) {
	    mail.setFrom(rs.getString("mail_from"));
	}
	
	if (findColumnNames(rs, "mail_to")) {
	    mail.setTo(rs.getString("mail_to"));
	}
	
	if (findColumnNames(rs, "cc")) {
	    mail.setCc(rs.getString("cc"));
	}
	
	if (findColumnNames(rs, "bcc")) {
	    mail.setBcc(rs.getString("bcc"));
	}
	
	if (findColumnNames(rs, "subject")) {
	    mail.setSubject(rs.getString("subject"));
	}
	
	if (findColumnNames(rs, "date")) {
	    mail.setDate(DateFormate().format(rs.getTimestamp("date")));
	}
	
	if (findColumnNames(rs, "msg")) {
	    mail.setMsg(rs.getString("msg"));
	}
	
	if (findColumnNames(rs, "status")) {
	    mail.setStatus(rs.getInt("status"));
	}
	
	if(findColumnNames(rs, "sendTime")) {
	    mail.setDate(DateFormate().format(rs.getTimestamp("sendTime")));
	}
	
	if (findColumnNames(rs, "deleted")) {
	    mail.setDeleted(rs.getBoolean("deleted"));
	}
	
	if (findColumnNames(rs, "modifierid")) {
	    mail.setModId(rs.getString("modifierid"));
	}
	
	return mail;
    }

}

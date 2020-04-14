package com.example.utskuy.view;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

@Named
@RequestScoped
public class EmployeeBean {

	// Member Variables
    private String empName;
    private String gender;
    private Date dob;
    private String address;
    private String emailAddress;
    private String mobileNumber;
    private String designation;
    private String department;
    private boolean employeeType;
 
    // Member Methods
    public String getEmpName() {
        return empName;
    }
 
    public void setEmpName(String empName) {
        this.empName = empName;
    }
 
    public String getGender() {
        return gender;
    }
 
    public void setGender(String gender) {
        this.gender = gender;
    }
 
    public Date getDob() {
        return dob;
    }
 
    public void setDob(Date dob) {
        this.dob = dob;
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
    public String getEmailAddress() {
        return emailAddress;
    }
 
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
 
    public String getMobileNumber() {
        return mobileNumber;
    }
 
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
 
    public String getDesignation() {
        return designation;
    }
 
    public void setDesignation(String designation) {
        this.designation = designation;
    }
 
    public String getDepartment() {
        return department;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    }
 
    public boolean isEmployeeType() {
        return employeeType;
    }
 
    public void setEmployeeType(boolean employeeType) {
        this.employeeType = employeeType;
    }
 
    // Validate Email
    public void validateEmail(FacesContext context, UIComponent toValidate, Object value) throws ValidatorException {
        String emailStr = (String) value;
        if (-1 == emailStr.indexOf("@")) {
            FacesMessage message = new FacesMessage("Email Valid");
            throw new ValidatorException(message);
        }
    }
 
    // Action Methods
    public String storeEmployeeInfo() {
        boolean stored = true;
        FacesMessage message = null;
        String outcome = null;
        if (stored) {
            message = new FacesMessage("Sukses Menyimpan Informasi Mahasiswa.");
            outcome = "sucess";
        } else {
            message = new FacesMessage("Gagal Menyimpan Informasi Mahasiswa.");
            outcome = "home";
        }
        FacesContext.getCurrentInstance().addMessage(null, message);
        return outcome;
    }

}

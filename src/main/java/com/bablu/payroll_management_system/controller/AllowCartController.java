/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bablu.payroll_management_system.controller;

import com.bablu.payroll_management_system.dao.AllowanceService;
import com.bablu.payroll_management_system.dao.EmpInfoService;
import com.bablu.payroll_management_system.dao.JobAllowCalService;
import com.bablu.payroll_management_system.dao.JobTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AllowCartController {
    @Autowired
    JobAllowCalService jdcs;
    @Autowired
    EmpInfoService eis;
    @Autowired
    AllowanceService as;
    @Autowired
    JobTitleService jts;
}

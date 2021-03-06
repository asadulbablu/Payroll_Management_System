/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bablu.payroll_management_system.dao;

import com.bablu.payroll_management_system.model.Payment;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    public String insertPayment(Payment cm);

    public String updatePayment( int payid,Payment cm);

    public Integer deletePayment(int id);

    public String viewPayment();

    public Payment viewOnePayment(int id);
}

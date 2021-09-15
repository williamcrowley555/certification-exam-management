/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certification_exam.bll.impl;

import com.certification_exam.bll.IThongKeTourBLL;
import com.certification_exam.dal.impl.ThongKeTourDAL;
import com.certification_exam.dto.ThongKeTourDTO;
import java.util.List;
import com.certification_exam.dal.IThongKeTourDAL;

/**
 *
 * @author kossp
 */
public class ThongKeTourBLL implements IThongKeTourBLL{
private IThongKeTourDAL thongKeTourDAO;

    public ThongKeTourBLL() {
        this.thongKeTourDAO = new ThongKeTourDAL();
    }

    @Override
    public List<ThongKeTourDTO> findAll() {
        return thongKeTourDAO.findAll();
    }    
}

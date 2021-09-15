/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certification_exam.mapper.impl;

import com.certification_exam.dto.DsDiaDiemTourDTO;
import com.certification_exam.mapper.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DsDiaDiemTourMapper implements RowMapper<DsDiaDiemTourDTO>{

    @Override
    public DsDiaDiemTourDTO mapRow(ResultSet rs) {
        try {
            DsDiaDiemTourDTO dsDiaDiemTour = new DsDiaDiemTourDTO();
            dsDiaDiemTour.setIdTour(rs.getLong("idTour"));
            dsDiaDiemTour.setIdDiaDiem(rs.getLong("idDiaDiem"));
            dsDiaDiemTour.setStt(rs.getInt("stt"));
            
            return dsDiaDiemTour;
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}

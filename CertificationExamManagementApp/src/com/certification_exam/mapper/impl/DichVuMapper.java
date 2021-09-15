/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certification_exam.mapper.impl;

import com.certification_exam.dto.DichVuDTO;
import com.certification_exam.mapper.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DichVuMapper implements RowMapper<DichVuDTO>{

    @Override
    public DichVuDTO mapRow(ResultSet rs) {
        try {
            DichVuDTO dichVu = new DichVuDTO();
            dichVu.setId(rs.getLong("id"));
            dichVu.setTenDichVu(rs.getString("ten_dich_vu"));
            dichVu.setMoTa(rs.getString("mo_ta"));

            return dichVu;
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}

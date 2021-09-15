/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certification_exam.mapper.impl;

import com.certification_exam.dto.DsKhachDoanDTO;
import com.certification_exam.mapper.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kossp
 */
public class DsKhachDoanMapper implements RowMapper<DsKhachDoanDTO> {
    @Override
        public DsKhachDoanDTO mapRow(ResultSet rs) {
            try {
                DsKhachDoanDTO dsKhachDoan = new DsKhachDoanDTO();
                dsKhachDoan.setIdDoan(rs.getLong("id_doan"));
                dsKhachDoan.setIdKhach(rs.getLong("id_khach"));            

                return dsKhachDoan;
            } catch(SQLException e) {
                System.out.println(e.getMessage());
            }
            return null;
        }        
}

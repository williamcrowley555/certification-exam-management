/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certification_exam.dal.impl;

import com.certification_exam.dto.DsDiaDiemTourDTO;
import com.certification_exam.mapper.impl.DsDiaDiemTourMapper;
import com.certification_exam.mapper.impl.IdDiaDiemTourMapper;
import java.util.List;
import com.certification_exam.dal.IDsDiaDiemTourDAL;

/**
 *
 * @author HP
 */
public class DsDiaDiemTourDAL extends AbstractDAL<DsDiaDiemTourDTO> implements IDsDiaDiemTourDAL {

    @Override
    public List<DsDiaDiemTourDTO> findAll() {
        String sql = "SELECT * FROM ds_dia_diem_tour ORDER BY stt ASC";
        return query(sql, new DsDiaDiemTourMapper());
    }

    @Override
    public DsDiaDiemTourDTO findById(Long idTour) {
        String sql = "SELECT * FROM ds_dia_diem_tour WHERE id_tour = ? ORDER BY stt ASC";
        List<DsDiaDiemTourDTO> dsDiaDiemTour = query(sql, new DsDiaDiemTourMapper(), idTour);
        return dsDiaDiemTour.isEmpty() ? null : dsDiaDiemTour.get(0);
    }

    @Override
    public Long save(DsDiaDiemTourDTO dsDiaDiemTour) {
        String sql = "INSERT INTO ds_dia_diem_tour(id_tour, id_dia_diem, stt) VALUES(?, ?, ?)";
        return insert(sql, dsDiaDiemTour.getIdTour(), dsDiaDiemTour.getIdDiaDiem(), dsDiaDiemTour.getStt());
    }

    @Override
    public List<Long> findByIdTour(Long idTour) {
        String sql = "SELECT * FROM ds_dia_diem_tour WHERE id_tour = ? ORDER BY stt ASC";
        return query(sql, new  IdDiaDiemTourMapper(), idTour);
    }

    @Override
    public void deleteByIdTour(Long idTour) {
        String sql = "DELETE FROM ds_dia_diem_tour WHERE id_tour = ?";
        update(sql, idTour);
    }
}

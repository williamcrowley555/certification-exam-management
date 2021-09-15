/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certification_exam.bll;

import com.certification_exam.dto.TinhDTO;
import java.util.List;

/**
 *
 * @author kossp
 */
public interface ITinhBLL {
    List<TinhDTO> findAll();
    TinhDTO findById(Long id);
    Long save(TinhDTO tinh);
    void update(TinhDTO tinh);
    void delete(Long id);   
}

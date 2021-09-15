/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certification_exam.bll;

import com.certification_exam.dto.EnglishLevel;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IEnglishLevelBLL {
    List<EnglishLevel> findAll();
    EnglishLevel findById(Long id);
    Long save(EnglishLevel englishLevel);
    void update(EnglishLevel englishLevel);
    void delete(Long id);
}

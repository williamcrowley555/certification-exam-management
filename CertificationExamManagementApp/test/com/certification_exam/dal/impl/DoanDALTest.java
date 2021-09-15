/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certification_exam.dal.impl;

import com.certification_exam.dal.impl.DoanDAL;
import com.certification_exam.dto.DoanDTO;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class DoanDALTest {
    
    public DoanDALTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testFindAll() {
        System.out.println("findAll");
        DoanDAL instance = new DoanDAL();
        List<DoanDTO> result = instance.findAll();
        assertNotNull(result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testFindById() {
        System.out.println("findById");
        Long id = 1L;
        DoanDAL instance = new DoanDAL();
        DoanDTO result = instance.findById(id);
        assertNotNull(result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByIdTour() {
        System.out.println("findByIdTour");
        Long idTour = 291L;
        DoanDAL instance = new DoanDAL();
        List<DoanDTO> result = instance.findByIdTour(idTour);
        for (DoanDTO doan : result) {
            assertEquals(idTour, doan.getIdTour());
        }
//        fail("The test case is a prototype.");
    }

    @Test
    public void testSave() {
        System.out.println("save");
        String tenDoan = "Thảo Cầm Viên Sài Gòn";
        LocalDate ngayKhoiHanh = LocalDate.of(2021, Month.APRIL, 22);
        LocalDate ngayKetThuc = LocalDate.of(2021, Month.APRIL, 23);
        Long idTour = 291L;
        
        DoanDTO doan = new DoanDTO();
        doan.setTenDoan(tenDoan);
        doan.setNgayKhoiHanh(ngayKhoiHanh);
        doan.setNgayKetThuc(ngayKetThuc);
        doan.setIdTour(idTour);
        
        DoanDAL instance = new DoanDAL();
        Long savedId = instance.save(doan);
        DoanDTO result = instance.findById(savedId);
        
        assertEquals(tenDoan, result.getTenDoan());
        assertEquals(ngayKhoiHanh, result.getNgayKhoiHanh());
        assertEquals(ngayKetThuc, result.getNgayKetThuc());
        assertEquals(idTour, result.getIdTour());
//        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Long doanId = 3L;
        String tenDoan = "Du lịch Đà Lạt";
        DoanDAL instance = new DoanDAL();
        DoanDTO doan = instance.findById(doanId);
        doan.setTenDoan(tenDoan);
        instance.update(doan);
        assertEquals(tenDoan, instance.findById(doanId).getTenDoan());
//        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateAmount() {
        System.out.println("updateAmount");
        Long doanId = 3L;
        int amount = 6;
        DoanDAL instance = new DoanDAL();
        instance.updateAmount(doanId, amount);
        assertEquals(amount, instance.findById(doanId).getSoLuong());
//        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Long id = 3L;
        DoanDAL instance = new DoanDAL();
        instance.delete(id);
        assertNull(instance.findById(id));
//        fail("The test case is a prototype.");
    }
}

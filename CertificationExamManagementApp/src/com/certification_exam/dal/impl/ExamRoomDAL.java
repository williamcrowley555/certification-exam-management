/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certification_exam.dal.impl;

import com.certification_exam.dal.IExamRoomDAL;
import com.certification_exam.dto.ExamRoom;
import com.certification_exam.mapper.impl.ExamRoomMapper;
import java.util.List;

/**
 *
 * @author HP
 */
public class ExamRoomDAL extends AbstractDAL<ExamRoom> implements IExamRoomDAL {
    
    @Override
    public List<ExamRoom> findAll() {
        String sql = "SELECT * FROM exam_room";
        return query(sql, new ExamRoomMapper());
    }

    @Override
    public ExamRoom findById(Long id) {
        String sql = "SELECT * FROM exam_room WHERE id = ?";
        List<ExamRoom> examRoom = query(sql, new ExamRoomMapper(), id);
        return examRoom.isEmpty() ? null : examRoom.get(0);
    }

    @Override
    public Long save(ExamRoom examRoom) {
        String sql = "INSERT INTO exam_room(name, quantity, exam_date, proctor_id, examiner_id, exam_course_id) VALUES(?, ?, ?, ?, ?, ?)";
        return insert(sql, examRoom.getName(), examRoom.getQuantity(), examRoom.getExamDate(), examRoom.getProctorId(), examRoom.getExaminerId(), examRoom.getExamCourseId());
    }

    @Override
    public void update(ExamRoom examRoom) {
        String sql = "UPDATE exam_room SET name = ?, quantity = ?, exam_date = ?, proctor_id = ?, examiner_id = ?, exam_course_id = ? WHERE id = ?";
        update(sql, examRoom.getName(), examRoom.getQuantity(), examRoom.getExamDate(), examRoom.getProctorId(), examRoom.getExaminerId(), examRoom.getExamCourseId(), examRoom.getId());
    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM exam_room WHERE id = ?";
        update(sql, id);
    }
}

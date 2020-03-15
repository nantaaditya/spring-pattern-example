package com.nantaaditya.tutorial.spring.service;

import com.nantaaditya.tutorial.spring.command.Command;
import com.nantaaditya.tutorial.spring.model.EmptyRequest;
import com.nantaaditya.tutorial.spring.model.StudentModel;

import java.util.List;

/**
 * created by pramuditya.anantanur
 **/
public interface GetStudentCommand extends Command<EmptyRequest, List<StudentModel>> {
}

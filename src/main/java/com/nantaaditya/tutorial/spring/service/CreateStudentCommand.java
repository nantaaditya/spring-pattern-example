package com.nantaaditya.tutorial.spring.service;

import com.nantaaditya.tutorial.spring.command.Command;
import com.nantaaditya.tutorial.spring.model.StudentModel;

/**
 * created by pramuditya.anantanur
 **/
public interface CreateStudentCommand extends Command<StudentModel, Boolean> {
}

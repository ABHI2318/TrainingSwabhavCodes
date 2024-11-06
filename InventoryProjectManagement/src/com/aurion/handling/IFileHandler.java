package com.aurion.handling;

import com.aurion.exceptions.FileProcessingException;

import java.util.List;

public interface IFileHandler<Type> {
    void save(List<Type> items) throws FileProcessingException;
    List<Type> load() throws FileProcessingException;
}
package com.aurion.handling;

import com.aurion.exceptions.FileProcessingException;

import java.util.List;

public interface IFileHandler<T> {
    void save(List<T> items) throws FileProcessingException;
    List<T> load() throws FileProcessingException;
}

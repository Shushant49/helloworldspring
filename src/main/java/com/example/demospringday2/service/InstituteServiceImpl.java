package com.example.demospringday2.service;

import com.example.demospringday2.model.Institute;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InstituteServiceImpl implements InstituteService {
    @Override
    public List<Institute> instituteList() {
        Institute institute = new Institute(2, "stratitude", "Irving", "3434");
        Institute institute1 = new Institute(3, "abcd", "Irving", "5676");

        List<Institute> instituteList = new ArrayList<>();
        instituteList.add(institute);
        instituteList.add(institute1);

        return instituteList;

    }
}

package com.example.cachedemo;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

    @Entity
    @NoArgsConstructor
    @Getter
    @Setter
//    @Builder
    public class Employee implements Serializable {

        private static final long serialVersionUID = 6527855645691638321L;

        @Id
        @GeneratedValue
        private int id;
        private String name;

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


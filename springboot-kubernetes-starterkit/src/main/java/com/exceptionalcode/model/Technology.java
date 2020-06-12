package com.exceptionalcode.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class Technology implements Serializable {
    private static final long serialVersionUID = 4889087778273529265L;

    @Id
    private String name;

    private String framework;

}

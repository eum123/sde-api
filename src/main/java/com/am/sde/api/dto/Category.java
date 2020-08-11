package com.am.sde.api.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "category_no")
    private int categoryNo;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "parent_no")
    private Integer parentNo;

    private int depth;
}
package com.platzi.pizza.persistence.audit;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@MappedSuperclass
public class AuditableEntity {
    @Column(name = "created_date")
    @CreatedDate
    private LocalDateTime createDate;
    @LastModifiedDate
    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;

    @Column(name = "created_by")
    @CreatedBy
    private String creaedBy;

    @LastModifiedBy
    @Column(name = "modified_by")
    private String modifiedBy;
}

package com.psych.game.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class Employee  extends Auditable {

    @Getter
    @Setter
    @NotBlank
    private String name;

    @Getter
    @Setter
    @NotBlank
    @Email
    private String email;

    @Getter
    @Setter
    @NotBlank
    private String address;

    @Getter
    @Setter
    @NotBlank
    private String phoneNumber;

}

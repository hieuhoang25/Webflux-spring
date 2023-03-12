package com.hicode.webflux.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tutorial {
    @Id
    private int id;

    private String title;

    private String description;

    private boolean published;
}

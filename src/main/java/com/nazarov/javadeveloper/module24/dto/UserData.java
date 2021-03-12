package com.nazarov.javadeveloper.module24.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserData {

    private Long id;
    private String firstName;
    private String lastName;
    private String bucket;
    private String path;
}

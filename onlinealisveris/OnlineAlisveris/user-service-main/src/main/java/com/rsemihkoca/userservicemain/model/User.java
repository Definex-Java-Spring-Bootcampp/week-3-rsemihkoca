package com.rsemihkoca.userservicemain.model;


import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User {

    private String userId;
    private String name;
    private Integer age;
}

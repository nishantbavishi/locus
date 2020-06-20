package com.locus.assignment.model.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResourceAccessDto {

    private Integer id;
    private Integer resourceId;
    private Integer roleId;
    private Integer actionId;
}

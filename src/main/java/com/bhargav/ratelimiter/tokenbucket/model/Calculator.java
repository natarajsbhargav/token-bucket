package com.bhargav.ratelimiter.tokenbucket.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Calculator implements Serializable {

    private static final long serialVersionUID = 8657144228155995304L;

    private String operation;
    private int answer;

}

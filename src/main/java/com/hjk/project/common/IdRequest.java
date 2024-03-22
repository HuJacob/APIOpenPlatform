package com.hjk.project.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hjk
 */
@Data
public class IdRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}

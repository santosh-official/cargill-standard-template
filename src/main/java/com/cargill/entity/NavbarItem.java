
package com.cargill.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class NavbarItem implements Serializable {

    private String title;
    private String path;
    private boolean haveSubItem;
    private List<SubItem> subItems ;

}
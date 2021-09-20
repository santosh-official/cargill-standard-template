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
public class Template implements Serializable {
    private String layout;
    private String projectName;
    private List<NavbarItem> navbarItems ;
    private List<SidebarItem> sidebarItems;
}

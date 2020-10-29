package com.example.hotrovn.model;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class City {

@SerializedName("Id")
@Expose
private Integer id;
@SerializedName("Name")
@Expose
private String name;
@SerializedName("Code")
@Expose
private String code;
@SerializedName("Province")
@Expose
private List<Province> provinces = null;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getCode() {
return code;
}

public void setCode(String code) {
this.code = code;
}

public List<Province> getProvince() {
return provinces;
}

public void setProvince(List<Province> provinces) {
this.provinces = provinces;
}

}





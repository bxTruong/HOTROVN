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
private List<Province> province = null;

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
return province;
}

public void setProvince(List<Province> province) {
this.province = province;
}

}

class District {

@SerializedName("Id")
@Expose
private Integer id;
@SerializedName("Name")
@Expose
private String name;
@SerializedName("Code")
@Expose
private String code;
@SerializedName("village")
@Expose
private List<Village> village = null;

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

public List<Village> getVillage() {
return village;
}

public void setVillage(List<Village> village) {
this.village = village;
}

}


class Province {

@SerializedName("Id")
@Expose
private Integer id;
@SerializedName("Name")
@Expose
private String name;
@SerializedName("Code")
@Expose
private String code;
@SerializedName("District")
@Expose
private List<District> district = null;

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

public List<District> getDistrict() {
return district;
}

public void setDistrict(List<District> district) {
this.district = district;
}

}

class Village {

@SerializedName("Id")
@Expose
private Integer id;
@SerializedName("Name")
@Expose
private String name;
@SerializedName("Code")
@Expose
private String code;

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

}
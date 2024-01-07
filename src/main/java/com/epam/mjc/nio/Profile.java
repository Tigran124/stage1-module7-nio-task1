package com.epam.mjc.nio;

import java.io.*;
import java.util.Objects;

public class Profile {

    private String name;
    private Integer age;
    private String email;
    private Long phone;

    public Profile(BufferedReader reader) throws IOException {
        while (reader.ready()){
            String[] line = reader.readLine().split(" ");
            if (Objects.equals(line[0], "Name:")){
                this.name = line[1];
            }else if (Objects.equals(line[0], "Age:")){
                this.age = Integer.valueOf(line[1]);
            }else if (Objects.equals(line[0], "Email:")){
                this.email = line[1];
            }else if (Objects.equals(line[0], "Phone:")){
                this.phone = Long.valueOf(line[1]);
            }
        }
    }
    public Profile(String name, Integer age, String email, Long phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Profile{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", email='").append(email).append('\'');
        sb.append(", phone=").append(phone);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Profile profile = (Profile) o;
        return getName().equals(profile.getName())
                && getAge().equals(profile.getAge())
                && getEmail().equals(profile.getEmail())
                && getPhone().equals(profile.getPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getEmail(), getPhone());
    }
}

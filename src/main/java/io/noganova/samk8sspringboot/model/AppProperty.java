package io.noganova.samk8sspringboot.model;

import java.io.Serializable;

/**
 * AppProperty
 */
public class AppProperty implements Serializable{

    private static final long serialVersionUID = 1L;
    String comkey01;
    String comkey02;
    String profilekey03;
    String profilekey04;

    public String getComkey01() {
        return this.comkey01;
    }

    public void setComkey01(String comkey01) {
        this.comkey01 = comkey01;
    }

    public String getComkey02() {
        return this.comkey02;
    }

    public void setComkey02(String comkey02) {
        this.comkey02 = comkey02;
    }

    public String getProfilekey03() {
        return this.profilekey03;
    }

    public void setProfilekey03(String profilekey03) {
        this.profilekey03 = profilekey03;
    }

    public String getProfilekey04() {
        return this.profilekey04;
    }

    public void setProfilekey04(String profilekey04) {
        this.profilekey04 = profilekey04;
    }


    
    public AppProperty() {
    }

}
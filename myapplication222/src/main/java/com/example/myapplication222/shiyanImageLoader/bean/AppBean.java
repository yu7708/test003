package com.example.myapplication222.shiyanImageLoader.bean;

/**
 * Created by 余 on 2017/5/9.
 */

public class AppBean {
    private String name;
    private String version;
    private String thumb;
    private int flieSize;
    private String intro;
    private String apk;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public int getFlieSize() {
        return flieSize;
    }

    public void setFlieSize(int flieSize) {
        this.flieSize = flieSize;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getApk() {
        return apk;
    }

    public void setApk(String apk) {
        this.apk = apk;
    }

    public AppBean() {
    }

    @Override
    public String toString() {
        return "AppBean{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", thumb='" + thumb + '\'' +
                ", flieSize=" + flieSize +
                ", intro='" + intro + '\'' +
                ", apk='" + apk + '\'' +
                '}';
    }
}

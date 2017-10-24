package com.webhawks.Hawks_model;

public class HUpload extends HObject {
    private int length;
    private byte[] bytes;
    private String name;
    private String saveName;
    private String type;
    private String path;
    
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public byte[] getBytes() {
        return bytes;
    }
    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSaveName() {
        return saveName;
    }
    public void setSaveName(String saveName) {
        this.saveName = saveName;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
}

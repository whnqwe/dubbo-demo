package cn.zhangspace;

import java.io.Serializable;

public class DoOrderRequest implements Serializable {

    private static final long serialVersionUID = -2628264260242204902L;


    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

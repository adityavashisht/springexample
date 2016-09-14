package com.indasil.lookup;

/**
 * Created by vashishta on 9/14/16.
 */
public class AutowireSlave {

    private Master masterName;

    public void setMasterName(Master masterName) {
        this.masterName = masterName;
    }

    public void master() {
        masterName.masterTask();
    }
}

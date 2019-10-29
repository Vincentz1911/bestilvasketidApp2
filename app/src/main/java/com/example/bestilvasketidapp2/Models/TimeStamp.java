package com.example.bestilvasketidapp2.Models;

import java.util.Date;

public class TimeStamp {

    public TimeStamp(int id, Date created, Date deleted, Date changed) {
        Id = id;
        Created = created;
        Deleted = deleted;
        Changed = changed;
    }

    private int Id;
    private Date Created;
    private Date Deleted;
    private Date Changed;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Date getCreated() {
        return Created;
    }

    public void setCreated(Date created) {
        Created = created;
    }

    public Date getDeleted() {
        return Deleted;
    }

    public void setDeleted(Date deleted) {
        Deleted = deleted;
    }

    public Date getChanged() {
        return Changed;
    }

    public void setChanged(Date changed) {
        Changed = changed;
    }
}
